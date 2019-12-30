package com.galleria.artiste.repository;

import com.galleria.artiste.model.Art;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtRepository extends PagingAndSortingRepository<Art, Long> {

  Art findByTitle(String title);
}
