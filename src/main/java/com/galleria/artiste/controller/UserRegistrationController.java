package com.galleria.artiste.controller;

import com.galleria.artiste.constants.AttributeName;
import com.galleria.artiste.constants.JspMapping;
import com.galleria.artiste.constants.UrlMapping;
import com.galleria.artiste.model.Artist;
import com.galleria.artiste.service.ArtistService;
import com.galleria.artiste.service.SecurityService;
import com.galleria.artiste.validator.ArtistValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlMapping.USER_REGISTRATION)
public class UserRegistrationController {

  @Autowired
  private ArtistValidator artistValidator;

  @Autowired
  private ArtistService artistService;

  @Autowired
  private SecurityService securityService;

  @GetMapping
  public String registerUser(Model model) {
    model.addAttribute(AttributeName.ARTIST_FORM, new com.galleria.artiste.model.Artist());
    return JspMapping.REGISTRATION;
  }

  @PostMapping
  public String registerUser(@ModelAttribute(AttributeName.ARTIST_FORM) Artist artistForm, BindingResult bindingResult,
      Model model) {
    artistValidator.validate(artistForm, bindingResult);
    if (bindingResult.hasErrors()) {
      return JspMapping.REGISTRATION;
    }
    artistService.save(artistForm);
    securityService.autologin(artistForm.getUsername(), artistForm.getPassword());
    return JspMapping.ADMIN;
  }
}
