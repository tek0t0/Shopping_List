package com.softuni.exam_prep1.service.impl;

import com.softuni.exam_prep1.models.entities.Category;
import com.softuni.exam_prep1.models.entities.enums.CategoryNameEnum;
import com.softuni.exam_prep1.repository.CategoryRepo;
import com.softuni.exam_prep1.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;

    public CategoryServiceImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public void initCategories() {
        if (categoryRepo.count() == 0) {
            CategoryNameEnum[] values = CategoryNameEnum.values();
            for (CategoryNameEnum value : values) {
                Category category = new Category(value);
                category.setDescription("Description for " + value.name());
                categoryRepo.save(category);

            }
        }
    }
}
