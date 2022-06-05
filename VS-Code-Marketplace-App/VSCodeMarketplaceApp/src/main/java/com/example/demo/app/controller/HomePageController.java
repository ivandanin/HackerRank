package com.example.demo.app.controller;

import com.example.demo.app.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    private final ProductService productService;


    @Autowired
    public HomePageController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String home(final Model model) {

        //most downloaded products
        model.addAttribute("mostDownloadedProducts", productService.getMostDownloaded());

        //newest products
        model.addAttribute("newProducts", productService.getNewest());

        //featured products
        model.addAttribute("featuredProducts", productService.getFeatured());

        // all products
        model.addAttribute("products",productService.getAll());

        return "home";
    }
}
