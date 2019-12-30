package com.galleria.artiste.service;

import com.galleria.artiste.model.Art;
import org.springframework.data.domain.Page;

public interface ArtService {

  void save(Art art);
  Art getByTitle(String title);
  Page<Art> getAllDrawings(int pageNo);
  Page<Art> getAllPhotographs(int pageNo);
}
