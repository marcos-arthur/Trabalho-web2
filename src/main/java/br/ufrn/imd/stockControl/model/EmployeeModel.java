package br.ufrn.imd.stockControl.model;

import java.util.LinkedList;

public class EmployeeModel extends UserModel {
    private LinkedList<EmployeeRolesModel> roles;

    public EmployeeModel(String name, String email, String password, LinkedList<EmployeeRolesModel> roles) {
        super(name, email, password);
        this.roles = roles;
    }

    public LinkedList<EmployeeRolesModel> getRoles() {
        return roles;
    }

    public void setRoles(LinkedList<EmployeeRolesModel> roles) {
        this.roles = roles;
    }
}
