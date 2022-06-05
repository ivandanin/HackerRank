package com.example.demo.app.controller;

import com.example.demo.app.models.ProductModel;
import com.example.demo.app.services.SearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @PostMapping("/search")
    public String search(String search, Model model) {

        // using to lowercase to make the search input and the names of products in the same case, to find the most matches
        String lowerInput = search.toLowerCase().trim();

        // the products that are found
        List<ProductModel> productsList = searchService.search(lowerInput);

        if (productsList.size() < 1) {
            return "emptyPage";
        }
        model.addAttribute("products", productsList);
        model.addAttribute("count", searchService.getCountOfSearched(search));
        return "allPages";
    }

    @GetMapping(value = "/autocomplete")
    @ResponseBody
    public List<String> autocomplete(@RequestParam(value = "term", required = false, defaultValue = "") String term) {
        return searchService.search(term)
                .stream().map(ProductModel::getName)
                .collect(Collectors.toList());
    }
}
