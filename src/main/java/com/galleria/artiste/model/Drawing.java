package com.galleria.artiste.model;

import com.galleria.artiste.model.common.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Drawing extends BaseEntity {

  private String title;
  private String path;
  private String image;
  private String thumb;
  private String original;
}
