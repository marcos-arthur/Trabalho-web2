package br.ufrn.imd.stockControl.repository;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import br.ufrn.imd.stockControl.model.ProductModel;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
}