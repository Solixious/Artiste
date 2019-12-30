package com.galleria.artiste.controller;

import com.galleria.artiste.constants.UrlMapping;
import com.galleria.artiste.model.Art;
import com.galleria.artiste.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(UrlMapping.API)
public class ContentController {

  @Autowired
  private ArtService artService;

  @GetMapping(UrlMapping.DRAWINGS)
  public List<Art> getDrawings(@RequestParam int page) {
    return artService.getAllDrawings(page).getContent();
  }

  @GetMapping(UrlMapping.PHOTOGRAPHS)
  public List<Art> getPhotographs(@RequestParam int page) {
    return artService.getAllPhotographs(page).getContent();
  }
}
