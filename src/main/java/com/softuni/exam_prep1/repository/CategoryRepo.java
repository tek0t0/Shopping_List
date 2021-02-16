package com.softuni.exam_prep1.repository;

import com.softuni.exam_prep1.models.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, String> {
}
