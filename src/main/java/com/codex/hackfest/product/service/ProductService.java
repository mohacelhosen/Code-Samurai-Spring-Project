package com.codex.hackfest.product.service;

import com.codex.hackfest.product.dto.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ProductService {

    private final RestClient restClient;

    public  ProductService(){
        restClient = RestClient.builder().baseUrl("https://dummyjson.com/products").build();
    }


    public Product getProduct(Integer productId){
        return restClient.get().uri("/{id}", productId).retrieve().body(Product.class);
    }
}
