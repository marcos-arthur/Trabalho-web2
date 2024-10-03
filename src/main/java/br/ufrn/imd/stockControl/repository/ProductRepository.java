package br.ufrn.imd.stockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufrn.imd.stockControl.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
}