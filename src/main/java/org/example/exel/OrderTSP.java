package org.example.exel;

import java.util.ArrayList;

public class OrderTSP {
    private ArrayList<Object> orderTSP = new ArrayList<>();

    public void orderForm() {
        Read read = new Read("C:\\Users\\1\\IdeaProjects\\untitled\\Ostatok.xlsx");
        ArrayList<Object> exel = read.getExel();
        orderTSP.add(0, exel.get(0));
        if ((double) exel.get(1) < 25) orderTSP.add(1, 25.0 - (double) exel.get(1));
        orderTSP.add(2, exel.get(2));
        if ((double) exel.get(3) < 25) orderTSP.add(3, 25.0 - (double) exel.get(3));
        orderTSP.add(4, exel.get(4));
        if ((double) exel.get(5) < 25) orderTSP.add(5, 25.0 - (double) exel.get(5));
        orderTSP.add(6, exel.get(6));
        if ((double) exel.get(7) < 25) orderTSP.add(7, 25.0 - (double) exel.get(7));
        orderTSP.add(8, exel.get(8));
        if ((double) exel.get(9) < 25) orderTSP.add(9, 25.0 - (double) exel.get(9));
        orderTSP.add(10, exel.get(10));
        if ((double) exel.get(11) < 25) orderTSP.add(11, 25.0 - (double) exel.get(11));
        orderTSP.add(12, exel.get(12));
        if ((double) exel.get(13) < 25) orderTSP.add(13, 25.0 - (double) exel.get(13));
        orderTSP.add(14, exel.get(14));
        if ((double) exel.get(15) < 25) orderTSP.add(15, 25.0 - (double) exel.get(15));
        orderTSP.add(16, exel.get(16));
        if ((double) exel.get(17) < 25) orderTSP.add(17, 25.0 - (double) exel.get(17));
        orderTSP.add(18, exel.get(18));
        if ((double) exel.get(19) < 25) orderTSP.add(19, 25.0 - (double) exel.get(19));
        orderTSP.add(20, exel.get(20));
        if ((double) exel.get(21) < 25) orderTSP.add(21, 25.0 - (double) exel.get(21));
        orderTSP.add(22, exel.get(22));
        if ((double) exel.get(23) < 25) orderTSP.add(23, 25.0 - (double) exel.get(23));
        orderTSP.add(24, exel.get(24));
        if ((double) exel.get(25) < 25) orderTSP.add(25, 25.0 - (double) exel.get(25));
        orderTSP.add(26, exel.get(26));
        if ((double) exel.get(27) < 25) orderTSP.add(27, 25.0 - (double) exel.get(27));
        orderTSP.add(28, exel.get(28));
        if ((double) exel.get(29) < 25) orderTSP.add(29, 25.0 - (double) exel.get(29));
        orderTSP.add(30, exel.get(30));
        if ((double) exel.get(31) < 25) orderTSP.add(31, 25.0 - (double) exel.get(31));
        orderTSP.add(32, exel.get(32));
        if ((double) exel.get(33) < 25) orderTSP.add(33, 25.0 - (double) exel.get(33));


    }

    public ArrayList<Object> getOrderTSP() {
        return orderTSP;
    }
}
