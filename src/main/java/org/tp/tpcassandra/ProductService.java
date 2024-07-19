package org.tp.tpcassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void deleteProductById(String id) {
        productRepository.deleteById(id);
    }
}