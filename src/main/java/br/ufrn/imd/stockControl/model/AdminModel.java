package br.ufrn.imd.stockControl.model;

import java.util.LinkedList;

public class AdminModel extends UserModel{
    private LinkedList<AdminRolesModel> roles;
    public AdminModel(String name, String email, String password, LinkedList<AdminRolesModel> roles) {
        super(name, email, password);
        this.roles = roles;
    }

    public LinkedList<AdminRolesModel> getRoles() {
        return roles;
    }

    public void setRoles(LinkedList<AdminRolesModel> roles) {
        this.roles = roles;
    }
}
