package com.anand.onlineshpoing;

public class cart {

    private String noOfItem;
    private Product product1;
    private Product product2;
    public cart(String noOfItem, Product product1) {
        this.noOfItem = noOfItem;
        this.product1 = product1;
    }



    public Product getProduct1() {
        return product1;
    }
    public void setProduct1(Product product1) {
        this.product1 = product1;
    }

    public Product getProduct2() {
        return product2;
    }

    public void setProduct2(Product product2) {
        this.product2 = product2;
    }

    public cart() {
    }

    public String getNoOfItem() {
        return noOfItem;
    }

    public void setNoOfItem(String noOfItem) {
        this.noOfItem = noOfItem;
    }

    public Product getproduct1() {
        return product1;
    }

    public void setproduct1(Product product1) {
        this.product1 = product1;
    }

    @Override
    public String toString() {
        return "cart{" +
                "noOfItem='" + noOfItem + '\'' +
                ", product1=" + product1 +
                ", product2=" + product2 +
                '}';
    }
}
