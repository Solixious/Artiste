package com.galleria.artiste.service;

import com.galleria.artiste.model.Artist;

import java.util.List;

public interface ArtistService {

  /**
   * @param username The username being seeked
   * @return The User object corresponding to the username provided
   */
  Artist findByUsername(String username);

  /**
   * @param email The email of the user being seeked
   * @return The User object corresponding to the email id provided
   */
  Artist findByEmail(String email);

  /**
   * @param artist Artist object to save
   */
  void save(Artist artist);
}

