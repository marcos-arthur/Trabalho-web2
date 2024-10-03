package br.ufrn.imd.stockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufrn.imd.stockControl.model.Store;

public interface StoreRepository extends JpaRepository<Store, Integer> {
}