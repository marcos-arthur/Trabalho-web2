package br.ufrn.imd.stockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufrn.imd.stockControl.model.StoreModel;

public interface StoreRepository extends JpaRepository<StoreModel, Integer> {
}