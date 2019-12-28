package com.galleria.artiste.service.impl;

import com.galleria.artiste.model.Artist;
import com.galleria.artiste.service.SecurityService;
import com.galleria.artiste.util.PreCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public String findLoggedInUsername() {
        final Object userDetails = (Artist) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (userDetails instanceof Artist) {
            return ((Artist) userDetails).getUsername();
        }
        return null;
    }

    @Override
    public void autologin(String username, String password) {
        PreCondition.checkNotNull(username, "username is null");
        PreCondition.checkNotNull(password, "password is null");
        final Artist userDetails = (Artist) userDetailsService.loadUserByUsername(username);
        final UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
            userDetails, password, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
    }
}
