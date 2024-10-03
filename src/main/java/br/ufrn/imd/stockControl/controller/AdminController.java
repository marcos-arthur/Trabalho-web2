package br.ufrn.imd.stockControl.controller;

import br.ufrn.imd.stockControl.model.FunctionNameModel;
import br.ufrn.imd.stockControl.model.UserTypeEnum;

import java.util.LinkedList;

public class AdminController extends UserController{
    public void addUser(String name, String email, String Password, UserTypeEnum userType){

    }

    public void updateUser(String name, String email, String Password){

    }

    public void deleteUser(int id){

    }

    public void createRole(String roleName, LinkedList<FunctionNameModel> functionNames){

    }

    public void updateRole(int id, LinkedList<FunctionNameModel> functionNames){

    }

    public void removeRole(int id){

    }

}
