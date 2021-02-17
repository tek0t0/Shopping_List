package com.softuni.exam_prep1.service.impl;

import com.softuni.exam_prep1.models.entities.Product;
import com.softuni.exam_prep1.models.service.ProductServiceModel;
import com.softuni.exam_prep1.repository.ProductRepo;
import com.softuni.exam_prep1.service.CategoryService;
import com.softuni.exam_prep1.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;
    private final CategoryService categoryService;

    public ProductServiceImpl(ProductRepo productRepo, ModelMapper modelMapper, CategoryService categoryService) {
        this.productRepo = productRepo;
        this.modelMapper = modelMapper;
        this.categoryService = categoryService;
    }

    @Override
    public void add(ProductServiceModel productServiceModel) {
        Product product = modelMapper.map(productServiceModel, Product.class);
        product.setCategory(categoryService.findByName(productServiceModel.getCategory()));
        productRepo.save(product);
    }
}
