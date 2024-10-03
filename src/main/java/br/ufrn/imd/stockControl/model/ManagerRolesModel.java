package br.ufrn.imd.stockControl.model;

import java.util.LinkedList;

public class ManagerRolesModel {
    private int id;
    private String name;
    private LinkedList<ManagerFunctionNameModel> functionNameList;

    public ManagerRolesModel(String name, LinkedList<ManagerFunctionNameModel> functionNameList) {
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

    public LinkedList<ManagerFunctionNameModel> getFunctionNameList() {
        return functionNameList;
    }

    public void setFunctionNameList(LinkedList<ManagerFunctionNameModel> functionNameList) {
        this.functionNameList = functionNameList;
    }
}
