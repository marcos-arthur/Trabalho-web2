package br.ufrn.imd.stockControl.model;

import java.util.LinkedList;

public class ManagerModel extends UserModel{
    private LinkedList<ManagerRolesModel> roles;

    public ManagerModel(String name, String email, String password, LinkedList<ManagerRolesModel> roles) {
        super(name, email, password);
        this.roles = roles;
    }

    public LinkedList<ManagerRolesModel> getRoles() {
        return roles;
    }

    public void setRoles(LinkedList<ManagerRolesModel> roles) {
        this.roles = roles;
    }
}
