package br.ufrn.imd.stockControl.controller;

import java.util.LinkedList;

import br.ufrn.imd.stockControl.model.ProductModel;

public class EmployeeController extends UserController{
    public void addProduct(String name, String description, float costPrice, float sellPrice, int inStock, int storeId){
        //todo
    }
    public LinkedList<ProductModel> listLowStock(int limit){
        // todo
        return new LinkedList<>();
    }

    public void buyProduct(int productId){
        //todo
    }

    public void sellProduct(int productId){
        //todo
    }
}
