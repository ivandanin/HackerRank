package com.example.demo.app.models;

import com.example.demo.app.models.enums.CategoryEnum;
//import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "categories")
public class Categories {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private CategoryEnum categoryEnum;

//    @OneToMany
    private List<ProductModel> products = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategoryEnum getCategoryEnum() {
        return categoryEnum;
    }

    public void setCategoryEnum(CategoryEnum categoryEnum) {
        this.categoryEnum = categoryEnum;
    }

    public List<ProductModel> getProducts() {
        return products;
    }

    public void setProducts(List<ProductModel> products) {
        this.products = products;
    }
}
