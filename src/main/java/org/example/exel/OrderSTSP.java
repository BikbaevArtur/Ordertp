package org.example.exel;

import java.util.ArrayList;

public class OrderSTSP {


    public void orderForm() {
        Read read = new Read("C:\\Users\\1\\IdeaProjects\\Ordertp\\Ostatok.xlsx"); // Открываем файл для чтения
        ArrayList<Object> exel = read.getExel();
        orderSTSP.add(0, exel.get(66));
        if ((double) exel.get(67) < stsp75) orderSTSP.add(1, stsp75 - (double) exel.get(67));
        else orderSTSP.add(1,0);
        orderSTSP.add(2, exel.get(68));
        if ((double) exel.get(69) < stsp150) orderSTSP.add(3, stsp150 - (double) exel.get(69));
        else orderSTSP.add(3,0);
        orderSTSP.add(4, exel.get(70));
        if ((double) exel.get(71) < stsp225) orderSTSP.add(5, stsp225 - (double) exel.get(71));
        else orderSTSP.add(5,0);
        orderSTSP.add(6, exel.get(72));
        if ((double) exel.get(73) < stsp300) orderSTSP.add(7, stsp300 - (double) exel.get(73));
        else orderSTSP.add(7,0);
        orderSTSP.add(8, exel.get(74));
        if ((double) exel.get(75) < stsp375) orderSTSP.add(9, stsp375 - (double) exel.get(75));
        else orderSTSP.add(9,0);
        orderSTSP.add(10, exel.get(10));
        if ((double) exel.get(11) < stsp450) orderSTSP.add(11, stsp450 - (double) exel.get(11));
        else orderSTSP.add(11,0);
        orderSTSP.add(12, exel.get(12));
        if ((double) exel.get(13) < stsp600) orderSTSP.add(13, stsp600 - (double) exel.get(13));
        else orderSTSP.add(13,0);
        orderSTSP.add(14, exel.get(14));
        if ((double) exel.get(15) < stsp900) orderSTSP.add(15, stsp900 - (double) exel.get(15));
        else orderSTSP.add(15,0);
        orderSTSP.add(16, exel.get(16));
        if ((double) exel.get(17) < stsp1200) orderSTSP.add(17, stsp1200 - (double) exel.get(17));
        else orderSTSP.add(17,0);
        orderSTSP.add(18, exel.get(18));
        if ((double) exel.get(19) < stsp1500) orderSTSP.add(19, stsp1500 - (double) exel.get(19));
        else orderSTSP.add(19,0);
        orderSTSP.add(20, exel.get(20));
        if ((double) exel.get(21) < stsp2000) orderSTSP.add(21, stsp2000 - (double) exel.get(21));
        else orderSTSP.add(21,0);
    }


    public double getStsp75() {
        return stsp75;
    }

    public void setStsp75(double stsp75) {
        this.stsp75 = stsp75;
    }

    public double getStsp150() {
        return stsp150;
    }

    public void setStsp150(double stsp150) {
        this.stsp150 = stsp150;
    }

    public double getStsp225() {
        return stsp225;
    }

    public void setStsp225(double stsp225) {
        this.stsp225 = stsp225;
    }

    public double getStsp300() {
        return stsp300;
    }

    public void setStsp300(double stsp300) {
        this.stsp300 = stsp300;
    }

    public double getStsp375() {
        return stsp375;
    }

    public void setStsp375(double stsp375) {
        this.stsp375 = stsp375;
    }

    public double getStsp450() {
        return stsp450;
    }

    public void setStsp450(double stsp450) {
        this.stsp450 = stsp450;
    }

    public double getStsp600() {
        return stsp600;
    }

    public void setStsp600(double stsp600) {
        this.stsp600 = stsp600;
    }

    public double getStsp900() {
        return stsp900;
    }

    public void setStsp900(double stsp900) {
        this.stsp900 = stsp900;
    }

    public double getStsp1200() {
        return stsp1200;
    }

    public void setStsp1200(double stsp1200) {
        this.stsp1200 = stsp1200;
    }

    public double getStsp1500() {
        return stsp1500;
    }

    public void setStsp1500(double stsp1500) {
        this.stsp1500 = stsp1500;
    }

    public double getStsp2000() {
        return stsp2000;
    }

    public void setStsp2000(double stsp2000) {
        this.stsp2000 = stsp2000;
    }


    public ArrayList<Object> getOrderSTSP() {
        return orderSTSP;
    }

    /**
     * Список для заявки
     */
    private ArrayList<Object> orderSTSP = new ArrayList<>(34);
    /*
    Минимальные остатки для создание заявки
     */
    private double stsp75 = 15.0;
    private double stsp150 = 15.0;
    private double stsp225 = 15.0;
    private double stsp300 = 15.0;
    private double stsp375 = 15.0;
    private double stsp450 = 8.0;
    private double stsp600 = 5.0;
    private double stsp900 = 5.0;
    private double stsp1200 = 5.0;
    private double stsp1500 = 5.0;
    private double stsp2000 = 5.0;
}
