package com.softuni.exam_prep1.models.binding;

import com.softuni.exam_prep1.models.entities.enums.CategoryNameEnum;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductBindingModel {

    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime neededBefore;
    private CategoryNameEnum category;

    public ProductBindingModel() {
    }

    @NotBlank(message = "Enter name")
    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 symbols!")
    public String getName() {
        return name;
    }

    public ProductBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    @NotBlank(message = "Enter description")
    @Size(min = 3, message = "Description must be min 5 symbols!")
    public String getDescription() {
        return description;
    }

    public ProductBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    @DecimalMin(value = "0", message = "Price must be positive number!")
    public BigDecimal getPrice() {
        return price;
    }

    public ProductBindingModel setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @FutureOrPresent(message = "The date can not be in the past!")
    public LocalDateTime getNeededBefore() {
        return neededBefore;
    }

    public ProductBindingModel setNeededBefore(LocalDateTime neededBefore) {
        this.neededBefore = neededBefore;
        return this;
    }

    @NotNull(message = "Select category!")
    public CategoryNameEnum getCategory() {
        return category;
    }

    public ProductBindingModel setCategory(CategoryNameEnum category) {
        this.category = category;
        return this;
    }
}
