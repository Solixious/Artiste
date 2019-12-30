package com.galleria.artiste.controller;

import com.galleria.artiste.constants.AttributeName;
import com.galleria.artiste.constants.JspMapping;
import com.galleria.artiste.constants.UrlMapping;
import com.galleria.artiste.model.Art;
import com.galleria.artiste.service.ArtService;
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
  private ArtService artService;

  @PostMapping(UrlMapping.ART)
  public String postArt(@RequestParam(AttributeName.FILE) MultipartFile file, Art art) {
    try {
      String filePath = fileStorageService.storeFile(file, art.getTitle() + ".jpg");
      art.setImage("/file/" + filePath);
      artService.save(art);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return JspMapping.ADMIN;
  }
}
