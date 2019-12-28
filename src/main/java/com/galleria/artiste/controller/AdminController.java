package com.galleria.artiste.controller;

import com.galleria.artiste.constants.JspMapping;
import com.galleria.artiste.constants.UrlMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(UrlMapping.ADMIN)
@Controller
public class AdminController {

  @GetMapping
  public String adminPage() {
    return JspMapping.ADMIN;
  }
}
