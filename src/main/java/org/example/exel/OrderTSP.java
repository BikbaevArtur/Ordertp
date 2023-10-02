package org.example.exel;

import java.util.ArrayList;

public class OrderTSP {


    public void orderForm() {
        Read read = new Read("C:\\Users\\1\\IdeaProjects\\untitled\\Ostatok.xlsx");
        ArrayList<Object> exel = read.getExel();
        orderTSP.add(0, exel.get(0));
        if ((double) exel.get(1) < tsp75) orderTSP.add(1, tsp75 - (double) exel.get(1));
        orderTSP.add(2, exel.get(2));
        if ((double) exel.get(3) < tsp150) orderTSP.add(3, tsp150 - (double) exel.get(3));
        orderTSP.add(4, exel.get(4));
        if ((double) exel.get(5) < tsp225) orderTSP.add(5, tsp225 - (double) exel.get(5));
        orderTSP.add(6, exel.get(6));
        if ((double) exel.get(7) < tsp300) orderTSP.add(7, tsp300 - (double) exel.get(7));
        orderTSP.add(8, exel.get(8));
        if ((double) exel.get(9) < tsp375) orderTSP.add(9, tsp375 - (double) exel.get(9));
        orderTSP.add(10, exel.get(10));
        if ((double) exel.get(11) < tsp450) orderTSP.add(11, tsp450 - (double) exel.get(11));
        orderTSP.add(12, exel.get(12));
        if ((double) exel.get(13) < tsp525) orderTSP.add(13, tsp525 - (double) exel.get(13));
        orderTSP.add(14, exel.get(14));
        if ((double) exel.get(15) < tsp600) orderTSP.add(15, tsp600 - (double) exel.get(15));
        orderTSP.add(16, exel.get(16));
        if ((double) exel.get(17) < tsp675) orderTSP.add(17, tsp675 - (double) exel.get(17));
        orderTSP.add(18, exel.get(18));
        if ((double) exel.get(19) < tsp750) orderTSP.add(19, tsp750 - (double) exel.get(19));
        orderTSP.add(20, exel.get(20));
        if ((double) exel.get(21) < tsp900) orderTSP.add(21, tsp900 - (double) exel.get(21));
        orderTSP.add(22, exel.get(22));
        if ((double) exel.get(23) < tsp1050) orderTSP.add(23, tsp1050 - (double) exel.get(23));
        orderTSP.add(24, exel.get(24));
        if ((double) exel.get(25) < tsp1200) orderTSP.add(25, tsp1200 - (double) exel.get(25));
        orderTSP.add(26, exel.get(26));
        if ((double) exel.get(27) < tsp1350) orderTSP.add(27, tsp1350 - (double) exel.get(27));
        orderTSP.add(28, exel.get(28));
        if ((double) exel.get(29) < tsp1500) orderTSP.add(29, tsp1500 - (double) exel.get(29));
        orderTSP.add(30, exel.get(30));
        if ((double) exel.get(31) < tsp1800) orderTSP.add(31, tsp1800 - (double) exel.get(31));
        orderTSP.add(32, exel.get(32));
        if ((double) exel.get(33) < tsp2250) orderTSP.add(33, tsp2250 - (double) exel.get(33));


    }

    public ArrayList<Object> getOrderTSP() {
        return orderTSP;
    }
    private ArrayList<Object> orderTSP = new ArrayList<>();
    private double tsp75;
    private double tsp150;
    private double tsp225;
    private double tsp300;
    private double tsp375;
    private double tsp450;
    private double tsp525;
    private double tsp600;
    private double tsp675;
    private double tsp750;
    private double tsp900;
    private double tsp1050;
    private double tsp1200;
    private double tsp1350;
    private double tsp1500;
    private double tsp1800;
    private double tsp2250;

}
