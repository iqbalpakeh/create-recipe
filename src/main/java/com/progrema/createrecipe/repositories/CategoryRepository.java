package com.progrema.createrecipe.repositories;

import com.progrema.createrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
