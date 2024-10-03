package br.ufrn.imd.stockControl.model;

import java.util.LinkedList;

public class EmployeeRolesModel {
    private int id;
    private String name;
    private LinkedList<EmployeeFunctionNameModel> functionNameList;

    public EmployeeRolesModel(String name, LinkedList<EmployeeFunctionNameModel> functionNameList) {
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

    public LinkedList<EmployeeFunctionNameModel> getFunctionNameList() {
        return functionNameList;
    }

    public void setFunctionNameList(LinkedList<EmployeeFunctionNameModel> functionNameList) {
        this.functionNameList = functionNameList;
    }
}
