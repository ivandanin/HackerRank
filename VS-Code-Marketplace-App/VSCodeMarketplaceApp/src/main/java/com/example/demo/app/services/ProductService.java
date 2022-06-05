package com.example.demo.app.services;

import com.example.demo.app.models.entityModels.ProductModel;

import java.util.List;

public interface ProductService {
    List<ProductModel> getAll();
    List<ProductModel> getNewest();
    List<ProductModel> getFeatured();
    List<ProductModel> getMostDownloaded();
    Integer getCount();
    List<ProductModel> sortByCriteria(String criteria);
    ProductModel findByName(String name);

    ProductModel getCurrent(int id);

}
