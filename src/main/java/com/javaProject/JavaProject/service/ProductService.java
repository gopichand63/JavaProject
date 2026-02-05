package com.javaProject.JavaProject.service;

import com.javaProject.JavaProject.exception.ProductNotFoundException;
import com.javaProject.JavaProject.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public Product addProduct(Product product) {
        product.setId(idGenerator.getAndIncrement());
        products.add(product);
        return product;
    }

    public Product getProductById(Long productId) {
        return products.stream()
                .filter(p -> p.getId().equals(productId))
                .findFirst()
                .orElseThrow(() -> new ProductNotFoundException(productId));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product updateProduct(Long productId, Product updatedproduct) {
        Product existingProduct = products.stream()
                .filter(p -> p.getId().equals(productId))
                .findFirst()
                .orElseThrow(() -> new ProductNotFoundException(productId));

        existingProduct.setProductName(updatedproduct.getProductName());
        existingProduct.setDescription(updatedproduct.getDescription());
        existingProduct.setPrice(updatedproduct.getPrice());
        existingProduct.setCategory(updatedproduct.getCategory());

        return existingProduct;
    }

    public Product deleteProduct(Long productId) {
        Product product = products.stream()
                .filter(p -> p.getId().equals(productId))
                .findFirst()
                .orElseThrow(() -> new ProductNotFoundException(productId));
        products.remove(product);
        return product;
    }


}
