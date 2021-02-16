package com.softuni.exam_prep1.init;

import com.softuni.exam_prep1.service.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInit implements CommandLineRunner {
    private final CategoryService categoryService;

    public DBInit(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public void run(String... args) throws Exception {
            categoryService.initCategories();





    }
}
