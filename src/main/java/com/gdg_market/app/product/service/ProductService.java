package com.gdg_market.app.product.service;

import com.gdg_market.app.product.dto.ProductRequestDTO;
import com.gdg_market.app.product.model.Product;

import java.util.List;


public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(ProductRequestDTO productRequestDTO);
    void deleteProductById(Long id);
}
