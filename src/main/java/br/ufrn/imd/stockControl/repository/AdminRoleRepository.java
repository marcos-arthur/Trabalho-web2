package br.ufrn.imd.stockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufrn.imd.stockControl.model.AdminRolesModel;

public interface AdminRoleRepository extends JpaRepository<AdminRolesModel, Integer> {
}