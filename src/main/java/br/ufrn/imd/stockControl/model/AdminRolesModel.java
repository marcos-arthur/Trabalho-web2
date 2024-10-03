package br.ufrn.imd.stockControl.model;

import java.util.LinkedList;

public class AdminRolesModel {
    private int id;
    private String name;
    private LinkedList<AdminFunctionNameModel> functionNameList;

    public AdminRolesModel(String name, LinkedList<AdminFunctionNameModel> functionNameList) {
        this.name = name;
        this.functionNameList = functionNameList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<AdminFunctionNameModel> getFunctionNameList() {
        return functionNameList;
    }

    public void setFunctionNameList(LinkedList<AdminFunctionNameModel> functionNameList) {
        this.functionNameList = functionNameList;
    }
}
