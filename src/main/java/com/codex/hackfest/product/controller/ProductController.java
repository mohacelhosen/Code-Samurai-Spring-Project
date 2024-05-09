package com.codex.hackfest.product.controller;

import com.codex.hackfest.product.dto.Product;
import com.codex.hackfest.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/{productId}")
    public ResponseEntity<?> getProductById(@PathVariable Integer productId){
        Product product = productService.getProduct(productId);
        return ResponseEntity.ok(product);
    }
}
