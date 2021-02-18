package com.softuni.exam_prep1.repository;

import com.softuni.exam_prep1.models.entities.Category;
import com.softuni.exam_prep1.models.entities.enums.CategoryNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepo extends JpaRepository<Category, String> {
    Optional<Category> findByName(CategoryNameEnum name);
}
