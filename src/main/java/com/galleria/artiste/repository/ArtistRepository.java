package com.galleria.artiste.repository;

import com.galleria.artiste.model.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long> {

    Artist findByUsername(String username);
    Artist findByEmail(String email);
    List<Artist> findByUsernameIgnoreCaseContaining(String username);

}
