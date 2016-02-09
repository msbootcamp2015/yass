package com.yass.repository;

import com.yass.domain.Catalog;
import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends CrudRepository<Catalog, String> {
  Catalog findOneByName(String name);
}
