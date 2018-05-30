package com.example.huyle.tastyvn.Model;

import java.util.List;

public class Request {
    private String address;
    private String total;
    private String status;
    private List<Order> foods;

    public Request() {
    }

    public Request(String address, String total, List<Order> foods) {
        this.address = address;
        this.total = total;
        this.foods = foods;
        this.status = "0";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }
}
