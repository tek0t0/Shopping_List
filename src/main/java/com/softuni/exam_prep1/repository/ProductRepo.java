package com.softuni.exam_prep1.repository;

import com.softuni.exam_prep1.models.entities.Product;
import com.softuni.exam_prep1.models.entities.enums.CategoryNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, String> {

    @Query("SELECT sum(p.price) from Product  p")
    BigDecimal findTotalProductsSum();

    List<Product> findAllByCategory_Name(CategoryNameEnum categoryNameEnum);

}
