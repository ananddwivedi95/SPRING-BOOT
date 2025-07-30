package com.anand.onlineshpoing;

public class Product {
    private String pName;
    private String pPrice;
    private String pQty;


    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpPrice() {
        return pPrice;
    }

    public void setpPrice(String pPrice) {
        this.pPrice = pPrice;
    }

    public String getpQty() {
        return pQty;
    }

    public void setpQty(String pQty) {
        this.pQty = pQty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pName='" + pName + '\'' +
                ", pPrice='" + pPrice + '\'' +
                ", pQty='" + pQty + '\'' +
                '}';
    }
}
