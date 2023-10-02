package org.example.exel;

import java.util.ArrayList;

public class OrderSTSP {

    private ArrayList<Object> orderSTSP = new ArrayList<>();

    public void orderForm() {
        Read read = new Read("C:\\Users\\1\\IdeaProjects\\untitled\\Ostatok.xlsx");
        ArrayList<Object> exel = read.getExel();
        orderSTSP.add(0, exel.get(0));
        if ((double) exel.get(1) < 25) orderSTSP.add(1, 25.0 - (double) exel.get(1));
        orderSTSP.add(2, exel.get(2));
        if ((double) exel.get(3) < 25) orderSTSP.add(3, 25.0 - (double) exel.get(3));
        orderSTSP.add(4, exel.get(4));
        if ((double) exel.get(5) < 20) orderSTSP.add(5, 25.0 - (double) exel.get(5));
        orderSTSP.add(6, exel.get(6));
        if ((double) exel.get(7) < 20) orderSTSP.add(7, 25.0 - (double) exel.get(7));
        orderSTSP.add(8, exel.get(8));
        if ((double) exel.get(9) < 15) orderSTSP.add(9, 25.0 - (double) exel.get(9));
        orderSTSP.add(10, exel.get(10));
        if ((double) exel.get(11) < 15) orderSTSP.add(11, 25.0 - (double) exel.get(11));
        orderSTSP.add(12, exel.get(12));
        if ((double) exel.get(13) < 10) orderSTSP.add(13, 25.0 - (double) exel.get(13));
        orderSTSP.add(14, exel.get(14));
        if ((double) exel.get(15) < 15) orderSTSP.add(15, 25.0 - (double) exel.get(15));
        orderSTSP.add(16, exel.get(16));
        if ((double) exel.get(17) < 10) orderSTSP.add(17, 25.0 - (double) exel.get(17));
        orderSTSP.add(18, exel.get(18));
        if ((double) exel.get(19) < 15) orderSTSP.add(19, 25.0 - (double) exel.get(19));
        orderSTSP.add(20, exel.get(20));
        if ((double) exel.get(21) < 10) orderSTSP.add(21, 25.0 - (double) exel.get(21));
        orderSTSP.add(22, exel.get(22));
        if ((double) exel.get(23) < 10) orderSTSP.add(23, 25.0 - (double) exel.get(23));
        orderSTSP.add(24, exel.get(24));
        if ((double) exel.get(25) < 5) orderSTSP.add(25, 25.0 - (double) exel.get(25));
        orderSTSP.add(26, exel.get(26));
        if ((double) exel.get(27) < 5) orderSTSP.add(27, 25.0 - (double) exel.get(27));
        orderSTSP.add(28, exel.get(28));
        if ((double) exel.get(29) < 5) orderSTSP.add(29, 25.0 - (double) exel.get(29));
        orderSTSP.add(30, exel.get(30));
        if ((double) exel.get(31) < 5) orderSTSP.add(31, 25.0 - (double) exel.get(31));
        orderSTSP.add(32, exel.get(32));
        if ((double) exel.get(33) < 5) orderSTSP.add(33, 25.0 - (double) exel.get(33));


    }

    public ArrayList<Object> getOrderSTSP() {
        return orderSTSP;
    }

}
