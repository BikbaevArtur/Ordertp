package org.example.exel;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
       // Read read = new Read("C:\\Users\\1\\IdeaProjects\\untitled\\Ostatok.xlsx");
       // read.printExel();

        OrderTSP order = new OrderTSP();
        order.orderForm();
        ArrayList<Object> order1 = order.getOrderTSP();
        for (Object i :order1
             ) {
            System.out.println(i);

        }
    }
}

