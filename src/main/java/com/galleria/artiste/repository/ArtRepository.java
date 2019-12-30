package com.galleria.artiste.repository;

import com.galleria.artiste.model.Art;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtRepository extends PagingAndSortingRepository<Art, Long> {

  Art findByTitle(String title);
  Page<Art> findByArtType(String artType, Pageable pageable);
}
