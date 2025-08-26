package com.anand.application.entity.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class ProductDetails {
    @Id
    private int id;
    private String productName;
    private String productPrice;
    private String productQuentity;

    public ProductDetails() {
    }
    public ProductDetails(int id, String productName, String productPrice, String productQuentity) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuentity = productQuentity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductQuentity() {
        return productQuentity;
    }

    public void setProductQuentity(String productQuentity) {
        this.productQuentity = productQuentity;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productQuentity='" + productQuentity + '\'' +
                '}';
    }
}
