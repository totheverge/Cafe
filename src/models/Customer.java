package models;

import java.util.List;

public class Customer {
    String Name;
    int balance;

    List<Order> orderList;

    public Customer(String name, int balance) {
        Name = name;
        this.balance = balance;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
