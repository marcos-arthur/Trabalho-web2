package br.ufrn.imd.stockControl.model;

public class FunctionNameModel {
    private int id;
    private String name;
    private UserTypeEnum userType;

    public FunctionNameModel(String name, UserTypeEnum userType) {
        this.name = name;
        this.userType = userType;
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

    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }
}
