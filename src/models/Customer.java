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

    public void getAllOrders(){


        System.out.println("Orders");

        for(Order order: this.getOrderList()){
            System.out.println("OrderId: "+order.getOrderId());
            System.out.println("Name \t \t \t \t Quantity");
            for(ItemOrder itemOrder: order.getItemOrderList()){
                System.out.println(itemOrder.getItem().getName()+"\t \t \t \t"+itemOrder.getQuantity());

            }
    }
}
public void getTotalMoneySpent(){
        int totalMoneySpent=0;
    for(Order order: this.getOrderList()){
        int totalMoneySpentForOrder = 0;
        for(ItemOrder itemOrder: order.getItemOrderList()){
            totalMoneySpentForOrder += itemOrder.getQuantity()*itemOrder.getItem().getPrice();
        }
        totalMoneySpent += totalMoneySpentForOrder;
    }
    System.out.println("Total Money Spent:"+totalMoneySpent);
}
}
