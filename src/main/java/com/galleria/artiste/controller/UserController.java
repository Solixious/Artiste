package com.galleria.artiste.controller;

import com.galleria.artiste.constants.JspMapping;
import com.galleria.artiste.constants.UrlMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Pratyush Choudhary on 2019-12-26
 */
@Controller
public class UserController {

    @GetMapping(value = UrlMapping.USER_LOGIN)
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
