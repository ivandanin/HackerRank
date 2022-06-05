package com.example.demo.app.controller;

import com.example.demo.app.services.GitHubService;
import com.example.demo.app.services.ProductService;
import com.example.demo.app.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;
    private final GitHubService gitHubService;

    @Autowired
    public ProductController(ProductService productService, GitHubService gitHubService) {
        this.productService = productService;
        this.gitHubService = gitHubService;
    }

    @GetMapping("/allPages")
    public String getSorted(@RequestParam(value = "sortBy", required = false, defaultValue = "") String criteria,
        Model model) {
        model.addAttribute("products", productService.sortByCriteria(criteria));

        // number of the products in DB
        model.addAttribute("count", productService.getCount());
        return "allPages";
    }

    // opening a product details page (PDP) of exact product
    @GetMapping("/pdp/{id}")
    public String getPdp(@PathVariable("id") int id, Model model) throws IOException {
        model.addAttribute("productModel", productService.getCurrent(id));
//        model.addAttribute("gitHub", gitHubService.getGitHubInfo(this.productService.getCurrent(id).getRepoName()));
        return "pdp";
    }
}
