package com.yass.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
  @Id
  @GeneratedValue
  private String id;
  private String name;

  @Override
  public String toString() {
    return "Product{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        '}';
  }
}
