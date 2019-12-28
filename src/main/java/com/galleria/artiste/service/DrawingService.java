package com.galleria.artiste.service;

import com.galleria.artiste.model.Drawing;
import org.springframework.data.domain.Page;

public interface DrawingService {

  void save(Drawing drawing);
  Drawing getByPath(String path);
  Page<Drawing> getAllDrawings(int pageNo);
}
