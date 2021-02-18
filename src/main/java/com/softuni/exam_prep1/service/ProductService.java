package com.softuni.exam_prep1.service;

import com.softuni.exam_prep1.models.entities.enums.CategoryNameEnum;
import com.softuni.exam_prep1.models.service.ProductServiceModel;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    void add(ProductServiceModel productServiceModel);

    BigDecimal getTotalSum();

    List<ProductServiceModel> findAllProductsByCategoryName(CategoryNameEnum categoryNameEnum);

    void buyById(String id);

    void buyAll();
}
