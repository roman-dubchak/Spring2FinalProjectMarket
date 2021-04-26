package com.geekbrains.geekmarket.repositories;

import com.geekbrains.geekmarket.entites.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
