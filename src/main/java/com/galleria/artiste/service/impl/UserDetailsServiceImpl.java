package com.galleria.artiste.service.impl;

import com.galleria.artiste.model.Artist;
import com.galleria.artiste.repository.ArtistRepository;
import com.galleria.artiste.util.PreCondition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ArtistRepository artistRepository;

    @Override
    @Transactional(readOnly = true)
    public Artist loadUserByUsername(final String username) throws UsernameNotFoundException {
        PreCondition.checkNotNull(username, "Username is null");
        final Artist artist = artistRepository.findByUsername(username);
        final Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        final Artist userDetail =
            new Artist(artist.getUsername(), artist.getPassword(), grantedAuthorities);
        userDetail.setFirstName(artist.getFirstName());
        userDetail.setLastName(artist.getLastName());
        return userDetail;
    }
}
