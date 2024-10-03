package br.ufrn.imd.stockControl.controller;

import br.ufrn.imd.stockControl.model.ProductModel;

public class ProductController {
    private ProductModel model;

    public ProductController(ProductModel model) {
        this.model = model;
    }

    public ProductModel getModel() {
        return model;
    }

    public void setModel(ProductModel model) {
        this.model = model;
    }

    public boolean isStockLow(int stockLlimit){
        // todo
        return true;
    }

    public void updateStock(){
        // todo
    }

    // O que esse método deveria fazer?
    public boolean isAvaiable(){
        // todo

        return true;
    }
}
