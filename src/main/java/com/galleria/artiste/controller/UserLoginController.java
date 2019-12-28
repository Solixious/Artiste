package com.galleria.artiste.controller;

import com.galleria.artiste.constants.JspMapping;
import com.galleria.artiste.constants.UrlMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pratyush Choudhary on 2019-12-26
 */
@Controller
@RequestMapping(UrlMapping.USER_LOGIN)
public class UserLoginController {

    @GetMapping
    public String login(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Your username and password is invalid");
        }
        if (logout != null) {
            model.addAttribute("message", "You have been logged out successfully");
        }
        return JspMapping.LOGIN;
    }
}
