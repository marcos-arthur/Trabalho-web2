package br.ufrn.imd.stockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufrn.imd.stockControl.model.StockOperation;

public interface StockOperationRepository extends JpaRepository<StockOperation, Integer> {
}
