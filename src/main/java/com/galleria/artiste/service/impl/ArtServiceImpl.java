package com.galleria.artiste.service.impl;

import com.galleria.artiste.model.Art;
import com.galleria.artiste.repository.ArtRepository;
import com.galleria.artiste.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ArtServiceImpl implements ArtService {

  private static final int PAGE_SIZE = 20;
  private static final String DRAWING = "Drawing";
  private static final String PHOTOGRAPH = "Photograph";

  @Autowired
  private ArtRepository artRepository;

  @Override
  public void save(Art art) {
    artRepository.save(art);
  }

  @Override
  public Art getByTitle(String title) {
    return artRepository.findByTitle(title);
  }

  @Override
  public Page<Art> getAllDrawings(int pageNo) {
    return artRepository.findByArtType(DRAWING, PageRequest.of(pageNo, PAGE_SIZE));
  }

  @Override
  public Page<Art> getAllPhotographs(int pageNo) {
    return artRepository.findByArtType(PHOTOGRAPH, PageRequest.of(pageNo, PAGE_SIZE));
  }
}
