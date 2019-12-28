package com.galleria.artiste.repository;

import com.galleria.artiste.model.Drawing;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrawingRepository extends PagingAndSortingRepository<Drawing, Long> {

  Drawing findByPath(String path);
}
