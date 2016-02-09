package com.yass.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Catalog {
  @Id
  @GeneratedValue
  private String id;
  private String name;
  @OneToMany
  private List<Product> products;

  @SuppressWarnings("unused")
  private Catalog() {
  }

  public Catalog(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Catalog{"
        + "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", products=" + products +
        '}';
  }
}
