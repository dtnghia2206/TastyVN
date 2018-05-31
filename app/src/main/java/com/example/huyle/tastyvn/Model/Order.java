package com.example.huyle.tastyvn.Model;

public class Order {
    private String productId;
    private String productName;
    private String quantity;
    private String price;
    private String image;


    public Order() {

    }

    public Order(String productId, String productName, String quantity, String price, String image) {
        this.productId = productId;
       this. productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.image = image;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        productName = productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        image = image;
    }

}
