package br.ufrn.imd.stockControl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufrn.imd.stockControl.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> listarProducts() {
        return productRepository.findAll();
    }

    public Product salvarProduct(Product product) {
        return productRepository.save(product);
    }

    public void atualizarEstoque(Integer productId, Integer quantidade) {
        Product product = productRepository.findById(productId).orElseThrow();
        product.setQtdEstoque(quantidade);
        productRepository.save(product);
    }
}