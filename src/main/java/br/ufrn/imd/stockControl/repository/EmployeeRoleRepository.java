package br.ufrn.imd.stockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufrn.imd.stockControl.model.EmployeeRolesModel;

public interface EmployeeRoleRepository extends JpaRepository<EmployeeRolesModel, Integer> {
}