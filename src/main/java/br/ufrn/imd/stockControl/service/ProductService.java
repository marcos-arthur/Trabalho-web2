package br.ufrn.imd.stockControl.service;

import java.util.List;

import br.ufrn.imd.stockControl.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufrn.imd.stockControl.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> listarProducts() {
        return productRepository.findAll();
    }

    public ProductModel salvarProduct(ProductModel product) {
        return productRepository.save(product);
    }

    public void atualizarEstoque(Integer productId, Integer quantidade) {
        ProductModel product = productRepository.findById(productId).orElseThrow();
        product.setInStock(quantidade);
        productRepository.save(product);
    }
}