package com.example.demo.app.services.impl;

import com.example.demo.app.models.ProductModel;
import com.example.demo.app.repositories.ProductRepository;
import com.example.demo.app.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchServiceImpl implements SearchService {

    private final ProductRepository productRepository;

    @Autowired
    public SearchServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // searching for a product or products in the DB
    // using to lowercase to make the search input and the names of products in the same case, to find the most matches
    @Override
    public List<ProductModel> search(String lowerInput) {

        return productRepository.findAll().stream()
                .filter(productModel -> productModel.getName().toLowerCase().contains(lowerInput))
                .collect(Collectors.toList());
    }

    // to change the count of products in all products page, depending on the result of the search
    @Override
    public Integer getCountOfSearched(String search) {
        return search(search).size();
    }

//    @Transactional
//    public List<String> getSuggestion(String term) {
//        return productRepository.findAll().stream().filter(p -> );
//    }
}
