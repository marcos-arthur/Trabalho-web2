package br.ufrn.imd.stockControl.model;

import java.util.Date;

public class StockLogModel {
    private int id;
    private ProductModel product;
    private OperationEnum operationEnum;
    private Date operationDate;
    private int operationSize;

    public StockLogModel(ProductModel product, OperationEnum operationEnum, Date operationDate, int operationSize) {
        this.product = product;
        this.operationEnum = operationEnum;
        this.operationDate = operationDate;
        this.operationSize = operationSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public OperationEnum getOperationEnum() {
        return operationEnum;
    }

    public void setOperationEnum(OperationEnum operationEnum) {
        this.operationEnum = operationEnum;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }

    public int getOperationSize() {
        return operationSize;
    }

    public void setOperationSize(int operationSize) {
        this.operationSize = operationSize;
    }
}
