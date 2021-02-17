package com.softuni.exam_prep1.service;

import com.softuni.exam_prep1.models.entities.Category;
import com.softuni.exam_prep1.models.entities.enums.CategoryNameEnum;

public interface CategoryService {
    void initCategories();

    Category findByName(CategoryNameEnum categoryNameEnum);
}
