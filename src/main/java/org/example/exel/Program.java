package org.example.exel;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        OrderTSP orderTSP = new OrderTSP();
        orderTSP.orderForm();
        ArrayList<Object> ordersTSP = orderTSP.getOrderTSP();
        for (Object order :ordersTSP) {
            System.out.println(order);

        }

        OrderTSP180 orderTSP180 = new OrderTSP180();
        orderTSP180.orderForm();
        ArrayList<Object>ordersTSP180 = orderTSP180.getOrderTSP180();
        for (Object order : ordersTSP180
             ) {
            System.out.println(order);
        }


        OrderSTSP orderSTSP = new OrderSTSP();
        orderSTSP.orderForm();
        ArrayList<Object>ordersSTST = orderSTSP.getOrderSTSP();
        for (Object order : ordersSTST
        ) {
            System.out.println(order);
        }
    }
}

