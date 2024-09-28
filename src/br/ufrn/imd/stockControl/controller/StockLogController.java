package br.ufrn.imd.stockControl.controller;

import br.ufrn.imd.stockControl.model.StockLogModel;

public class StockLogController {
    private StockLogModel model;

    public StockLogController(StockLogModel model) {
        this.model = model;
    }

    public StockLogModel getModel() {
        return model;
    }

    public void setModel(StockLogModel model) {
        this.model = model;
    }

    public void registerEntrance(){
        // todo
    }

    public void registerExit(){
        // todo
    }
}
