package br.ufrn.imd.stockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufrn.imd.stockControl.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
}