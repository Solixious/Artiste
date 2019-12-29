package com.galleria.artiste.controller;

import com.galleria.artiste.constants.AttributeName;
import com.galleria.artiste.constants.JspMapping;
import com.galleria.artiste.constants.UrlMapping;
import com.galleria.artiste.model.Drawing;
import com.galleria.artiste.service.DrawingService;
import com.galleria.artiste.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ArtController {

  @Autowired
  private FileStorageService fileStorageService;

  @Autowired
  private DrawingService drawingService;

  @PostMapping(UrlMapping.ART)
  public String postDrawing(@RequestParam(AttributeName.FILE) MultipartFile file, Drawing drawing) {
    try {
      String filePath = fileStorageService.storeFile(file, drawing.getTitle() + ".jpg");
      drawing.setImage(filePath);
      drawingService.save(drawing);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return JspMapping.ADMIN;
  }
}
