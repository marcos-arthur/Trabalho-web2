package br.ufrn.imd.stockControl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.ufrn.imd.stockControl.model.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}