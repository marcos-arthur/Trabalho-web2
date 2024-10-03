package br.ufrn.imd.stockControl.controller;

import br.ufrn.imd.stockControl.model.ProductModel;
import br.ufrn.imd.stockControl.model.StoreModel;

import java.util.Date;
import java.util.LinkedList;

public class StoreController {
    private StoreModel model;
    private LinkedList<ProductModel> stock;

    public StoreController(StoreModel model, LinkedList<ProductModel> stock) {
        this.model = model;
        this.stock = stock;
    }

    public StoreModel getModel() {
        return model;
    }

    public void setModel(StoreModel model) {
        this.model = model;
    }

    public LinkedList<ProductModel> getStock() {
        return stock;
    }

    public void setStock(LinkedList<ProductModel> stock) {
        this.stock = stock;
    }

    public void addProduct(ProductModel product){
        // todo
        stock.add(product);
    }

    public void removeProduct(ProductModel product){
        // todo
        stock.remove(product);
    }

    // Levar em Consideração que name, stockMin e stockMax podem ser opcionais
    public LinkedList<ProductModel> findProducts(int id, String name, int stockMin, int stockMax){
        // todo
        return new LinkedList<>();
    }

    public LinkedList<ProductModel> checkHistory(Date begin, Date end){
        // todo
        return new LinkedList<>();
    }

    public LinkedList<ProductModel> getLowStockProducts(int limit){
        // todo
        return new LinkedList<ProductModel>();
    }

    public void buyProduct(ProductModel product){
        // todo
    }

    public void sellProduct(ProductModel product){
        // todo
    }

}
