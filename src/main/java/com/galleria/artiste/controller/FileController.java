package com.galleria.artiste.controller;

import com.galleria.artiste.service.FileStorageService;
import com.galleria.artiste.constants.UrlMapping;
import com.galleria.artiste.exception.MyFileNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class FileController {

  @Autowired
  private FileStorageService fileStorageService;

  @GetMapping(UrlMapping.DOWNLOAD_FILE)
  public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request)
      throws MyFileNotFoundException {
    final Resource resource = fileStorageService.loadFileAsResource(fileName);
    String contentType = null;

    try {
      contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
    } catch (IOException e) {
      // could not determine content type
    }

    if (contentType == null)
      contentType = "application/octet-stream";

    return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType))
        .header(
            HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
        .body(resource);
  }
}
