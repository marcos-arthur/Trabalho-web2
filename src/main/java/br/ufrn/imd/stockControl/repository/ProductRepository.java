package br.ufrn.imd.stockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufrn.imd.stockControl.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}