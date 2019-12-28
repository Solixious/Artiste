package com.galleria.artiste.service.impl;

import com.galleria.artiste.model.Artist;
import com.galleria.artiste.repository.ArtistRepository;
import com.galleria.artiste.service.ArtistService;
import com.galleria.artiste.util.PreCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService {

  @Autowired
  private ArtistRepository artistRepository;

  @Autowired
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  @Override
  public Artist findByUsername(String username) {
    PreCondition.checkNotNull(username, "username should not be null");
    return artistRepository.findByUsername(username);
  }

  @Override
  public Artist findByEmail(String email) {
    PreCondition.checkNotNull(email, "email should not be null");
    return artistRepository.findByEmail(email);
  }

  @Override
  public void save(Artist artist) {
    PreCondition.checkNotNull(artist, "artist should not be null");
    artist.setPassword(bCryptPasswordEncoder.encode(artist.getPassword()));
    artistRepository.save(artist);
  }
}
