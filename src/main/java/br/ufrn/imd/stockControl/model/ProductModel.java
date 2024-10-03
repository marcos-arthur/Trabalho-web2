package br.ufrn.imd.stockControl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Entity
public class ProductModel {
    @Id
    private int id;
    private String name;
    private String description;
    private float costPrice;
    private float sellPrice;
    private int inStock;


    public ProductModel(String name, String description, float costPrice, float sellPrice, int inStock) {
        this.name = name;
        this.description = description;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.inStock = inStock;
    }

    public ProductModel() {

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(float costPrice) {
        this.costPrice = costPrice;
    }

    public float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
}
