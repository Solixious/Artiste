package com.galleria.artiste.controller;

import com.galleria.artiste.constants.AttributeName;
import com.galleria.artiste.constants.JspMapping;
import com.galleria.artiste.constants.UrlMapping;
import com.galleria.artiste.model.Artist;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlMapping.USER_REGISTRATION)
public class UserRegistrationController {

  @GetMapping
  public String registerUser(Model model) {
    model.addAttribute(AttributeName.USER_FORM, new Artist());
    return JspMapping.REGISTRATION;
  }
}
