package com.galleria.artiste.model;

import com.galleria.artiste.model.common.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Art extends BaseEntity {

  private String title;
  private String image;
  private String artType;
}
