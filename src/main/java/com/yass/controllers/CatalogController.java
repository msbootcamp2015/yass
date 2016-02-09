package com.yass.controllers;

import com.yass.domain.Catalog;
import com.yass.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {
  @Autowired
  private CatalogRepository repository;

  @RequestMapping("/catalog")
  public String index() {
    Catalog catalog = repository.findOneByName("default");
    return catalog.toString();
  }

}
