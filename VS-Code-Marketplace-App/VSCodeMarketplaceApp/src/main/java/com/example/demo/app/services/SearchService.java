package com.example.demo.app.services;

import com.example.demo.app.models.ProductModel;

import java.util.List;

public interface SearchService {
    List<ProductModel> search(String lowerInput);
    Integer getCountOfSearched(String search);
//    List<String> getSuggestion(String term);
}
