package org.example.exel;

import java.util.ArrayList;

public class OrderTSP180 {
    public void orderForm() {
        Read read = new Read("C:\\Users\\1\\IdeaProjects\\untitled\\Ostatok.xlsx");
        ArrayList<Object> exel = read.getExel();
        orderTSP180.add(34, exel.get(34));
        if ((double) exel.get(35) < 25) orderTSP180.add(35, 25.0 - (double) exel.get(1));
        orderTSP180.add(36, exel.get(36));
        if ((double) exel.get(37) < 25) orderTSP180.add(3, 25.0 - (double) exel.get(3));
        orderTSP180.add(38, exel.get(38));
        if ((double) exel.get(39) < 20) orderTSP180.add(39, 25.0 - (double) exel.get(5));
        orderTSP180.add(40, exel.get(40));
        if ((double) exel.get(41) < 20) orderTSP180.add(41, 25.0 - (double) exel.get(7));
        orderTSP180.add(42, exel.get(42));
        if ((double) exel.get(43) < 15) orderTSP180.add(43, 25.0 - (double) exel.get(9));
        orderTSP180.add(44, exel.get(44));
        if ((double) exel.get(45) < 15) orderTSP180.add(45, 25.0 - (double) exel.get(11));
        orderTSP180.add(46, exel.get(46));
        if ((double) exel.get(47) < 10) orderTSP180.add(47, 25.0 - (double) exel.get(13));
        orderTSP180.add(48, exel.get(48));
        if ((double) exel.get(49) < 15) orderTSP180.add(49, 25.0 - (double) exel.get(15));
        orderTSP180.add(50, exel.get(50));
        if ((double) exel.get(51) < 10) orderTSP180.add(51, 25.0 - (double) exel.get(17));
        orderTSP180.add(52, exel.get(52));
        if ((double) exel.get(53) < 15) orderTSP180.add(53, 25.0 - (double) exel.get(19));
        orderTSP180.add(54, exel.get(54));
        if ((double) exel.get(55) < 10) orderTSP180.add(55, 25.0 - (double) exel.get(21));
        orderTSP180.add(56, exel.get(56));
        if ((double) exel.get(57) < 10) orderTSP180.add(57, 25.0 - (double) exel.get(23));
        orderTSP180.add(58, exel.get(58));
        if ((double) exel.get(59) < 5) orderTSP180.add(59, 25.0 - (double) exel.get(25));
        orderTSP180.add(60, exel.get(60));
        if ((double) exel.get(61) < 5) orderTSP180.add(61, 25.0 - (double) exel.get(27));
        orderTSP180.add(62, exel.get(62));
        if ((double) exel.get(63) < 5) orderTSP180.add(63, 25.0 - (double) exel.get(29));
        orderTSP180.add(64, exel.get(64));
        if ((double) exel.get(65) < 5) orderTSP180.add(65, 25.0 - (double) exel.get(31));


    }

    public ArrayList<Object> getOrderTSP180() {
        return orderTSP180;
    }
    private ArrayList<Object> orderTSP180 = new ArrayList<>();


}
