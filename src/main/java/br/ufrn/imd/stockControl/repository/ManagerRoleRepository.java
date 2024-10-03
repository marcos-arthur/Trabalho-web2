package br.ufrn.imd.stockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufrn.imd.stockControl.model.ManagerRolesModel;

public interface ManagerRoleRepository extends JpaRepository<ManagerRolesModel, Integer> {
}