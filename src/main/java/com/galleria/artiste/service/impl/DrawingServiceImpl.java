package com.galleria.artiste.service.impl;

import com.galleria.artiste.model.Drawing;
import com.galleria.artiste.repository.DrawingRepository;
import com.galleria.artiste.service.DrawingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class DrawingServiceImpl implements DrawingService {

  @Autowired
  private DrawingRepository drawingRepository;

  @Override
  public void save(Drawing drawing) {
    drawingRepository.save(drawing);
  }

  @Override
  public Drawing getByPath(String path) {
    return drawingRepository.findByPath(path);
  }

  @Override
  public Page<Drawing> getAllDrawings(int pageNo) {
    return drawingRepository.findAll(PageRequest.of(pageNo, 20));
  }
}
