package br.ufrn.imd.stockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufrn.imd.stockControl.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}