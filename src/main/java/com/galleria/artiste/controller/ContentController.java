package com.galleria.artiste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ContentController {

  @GetMapping("/drawings")
  public List<String> getDrawings() {
    return Arrays.asList("/file/1.jpg", "/file/2.jpg", "/file/3.jpg", "/file/4.jpg", "/file/5.jpg",
        "/file/6.jpg", "/file/7.jpg", "/file/8.jpg", "/file/9.jpg", "/file/10.jpg",
        "/file/11.jpg", "/file/12.jpg", "/file/13.jpg");
  }

  @GetMapping("/photographs")
  public List<String> getPhotographs() {
    return Arrays.asList("/file/6.jpg", "/file/7.jpg", "/file/8.jpg", "/file/9.jpg", "/file/10.jpg",
        "/file/11.jpg", "/file/12.jpg", "/file/13.jpg", "/file/1.jpg", "/file/2.jpg",
        "/file/3.jpg", "/file/4.jpg", "/file/5.jpg");
  }
}