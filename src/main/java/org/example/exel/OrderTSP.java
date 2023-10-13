package org.example.exel;

import java.util.ArrayList;

public class OrderTSP {


    public void orderForm() {
        Read read = new Read("C:\\Users\\1\\IdeaProjects\\Ordertp\\Ostatok.xlsx"); // Открываем файл для чтения
        ArrayList<Object> exel = read.getExel();
        orderTSP.add(0, exel.get(0));
        if ((double) exel.get(1) < tsp75) orderTSP.add(1, tsp75 - (double) exel.get(1));
        else orderTSP.add(1,0);
        orderTSP.add(2, exel.get(2));
        if ((double) exel.get(3) < tsp150) orderTSP.add(3, tsp150 - (double) exel.get(3));
        else orderTSP.add(3,0);
        orderTSP.add(4, exel.get(4));
        if ((double) exel.get(5) < tsp225) orderTSP.add(5, tsp225 - (double) exel.get(5));
        else orderTSP.add(5,0);
        orderTSP.add(6, exel.get(6));
        if ((double) exel.get(7) < tsp300) orderTSP.add(7, tsp300 - (double) exel.get(7));
        else orderTSP.add(7,0);
        orderTSP.add(8, exel.get(8));
        if ((double) exel.get(9) < tsp375) orderTSP.add(9, tsp375 - (double) exel.get(9));
        else orderTSP.add(9,0);
        orderTSP.add(10, exel.get(10));
        if ((double) exel.get(11) < tsp450) orderTSP.add(11, tsp450 - (double) exel.get(11));
        else orderTSP.add(11,0);
        orderTSP.add(12, exel.get(12));
        if ((double) exel.get(13) < tsp525) orderTSP.add(13, tsp525 - (double) exel.get(13));
        else orderTSP.add(13,0);
        orderTSP.add(14, exel.get(14));
        if ((double) exel.get(15) < tsp600) orderTSP.add(15, tsp600 - (double) exel.get(15));
        else orderTSP.add(15,0);
        orderTSP.add(16, exel.get(16));
        if ((double) exel.get(17) < tsp675) orderTSP.add(17, tsp675 - (double) exel.get(17));
        else orderTSP.add(17,0);
        orderTSP.add(18, exel.get(18));
        if ((double) exel.get(19) < tsp750) orderTSP.add(19, tsp750 - (double) exel.get(19));
        else orderTSP.add(19,0);
        orderTSP.add(20, exel.get(20));
        if ((double) exel.get(21) < tsp900) orderTSP.add(21, tsp900 - (double) exel.get(21));
        else orderTSP.add(21,0);
        orderTSP.add(22, exel.get(22));
        if ((double) exel.get(23) < tsp1050) orderTSP.add(23, tsp1050 - (double) exel.get(23));
        else orderTSP.add(23,0);
        orderTSP.add(24, exel.get(24));
        if ((double) exel.get(25) < tsp1200) orderTSP.add(25, tsp1200 - (double) exel.get(25));
        else orderTSP.add(25,0);
        orderTSP.add(26, exel.get(26));
        if ((double) exel.get(27) < tsp1350) orderTSP.add(27, tsp1350 - (double) exel.get(27));
        else orderTSP.add(27,0);
        orderTSP.add(28, exel.get(28));
        if ((double) exel.get(29) < tsp1500) orderTSP.add(29, tsp1500 - (double) exel.get(29));
        else orderTSP.add(29,0);
        orderTSP.add(30, exel.get(30));
        if ((double) exel.get(31) < tsp1800) orderTSP.add(31, tsp1800 - (double) exel.get(31));
        else orderTSP.add(31,0);
        orderTSP.add(32, exel.get(32));
        if ((double) exel.get(33) < tsp2250) orderTSP.add(33, tsp2250 - (double) exel.get(33));
        else orderTSP.add(33,0);

    }


    public double getTsp75() {
        return tsp75;
    }

    public void setTsp75(double tsp75) {
        this.tsp75 = tsp75;
    }

    public double getTsp150() {
        return tsp150;
    }

    public void setTsp150(double tsp150) {
        this.tsp150 = tsp150;
    }

    public double getTsp225() {
        return tsp225;
    }

    public void setTsp225(double tsp225) {
        this.tsp225 = tsp225;
    }

    public double getTsp300() {
        return tsp300;
    }

    public void setTsp300(double tsp300) {
        this.tsp300 = tsp300;
    }

    public double getTsp375() {
        return tsp375;
    }

    public void setTsp375(double tsp375) {
        this.tsp375 = tsp375;
    }

    public double getTsp450() {
        return tsp450;
    }

    public void setTsp450(double tsp450) {
        this.tsp450 = tsp450;
    }

    public double getTsp525() {
        return tsp525;
    }

    public void setTsp525(double tsp525) {
        this.tsp525 = tsp525;
    }

    public double getTsp600() {
        return tsp600;
    }

    public void setTsp600(double tsp600) {
        this.tsp600 = tsp600;
    }

    public double getTsp675() {
        return tsp675;
    }

    public void setTsp675(double tsp675) {
        this.tsp675 = tsp675;
    }

    public double getTsp750() {
        return tsp750;
    }

    public void setTsp750(double tsp750) {
        this.tsp750 = tsp750;
    }

    public double getTsp900() {
        return tsp900;
    }

    public void setTsp900(double tsp900) {
        this.tsp900 = tsp900;
    }

    public double getTsp1050() {
        return tsp1050;
    }

    public void setTsp1050(double tsp1050) {
        this.tsp1050 = tsp1050;
    }

    public double getTsp1200() {
        return tsp1200;
    }

    public void setTsp1200(double tsp1200) {
        this.tsp1200 = tsp1200;
    }

    public double getTsp1350() {
        return tsp1350;
    }

    public void setTsp1350(double tsp1350) {
        this.tsp1350 = tsp1350;
    }

    public double getTsp1500() {
        return tsp1500;
    }

    public void setTsp1500(double tsp1500) {
        this.tsp1500 = tsp1500;
    }

    public double getTsp1800() {
        return tsp1800;
    }

    public void setTsp1800(double tsp1800) {
        this.tsp1800 = tsp1800;
    }

    public double getTsp2250() {
        return tsp2250;
    }

    public void setTsp2250(double tsp2250) {
        this.tsp2250 = tsp2250;
    }

    public ArrayList<Object> getOrderTSP() {
        return orderTSP;
    }

    /**
     * Список для заявки
     */
    private ArrayList<Object> orderTSP = new ArrayList<>(34);
    /*
    Минимальные остатки для создание заявки
     */
    private double tsp75 = 20.0;

    private double tsp150 = 25.0;
    private double tsp225 = 20.0;
    private double tsp300 = 20.0;
    private double tsp375= 15.0;
    private double tsp450 = 20.0;
    private double tsp525 = 15.0;
    private double tsp600 = 15.0;
    private double tsp675 = 10.0;
    private double tsp750 = 15.0;
    private double tsp900 = 15.0;
    private double tsp1050 = 10.0;
    private double tsp1200 = 5.0;
    private double tsp1350 = 4.0;
    private double tsp1500 = 5.0;
    private double tsp1800 = 4.0;
    private double tsp2250 = 4.0;

}
