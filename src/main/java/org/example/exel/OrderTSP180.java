package org.example.exel;

import java.util.ArrayList;

public class OrderTSP180 {


    public void orderForm() {
        Read read = new Read("C:\\Users\\1\\IdeaProjects\\Ordertp\\Ostatok.xlsx"); // Открываем файл для чтения
        ArrayList<Object> exel = read.getExel();
        orderTSP180.add(0, exel.get(34));
        if ((double) exel.get(35) < tsp90) orderTSP180.add(1, tsp90 - (double) exel.get(35));
        else orderTSP180.add(1,0);
        orderTSP180.add(2, exel.get(36));
        if ((double) exel.get(37) < tsp180) orderTSP180.add(3, tsp180 - (double) exel.get(37));
        else orderTSP180.add(3,0);
        orderTSP180.add(4, exel.get(38));
        if ((double) exel.get(39) < tsp260) orderTSP180.add(5, tsp260 - (double) exel.get(39));
        else orderTSP180.add(5,0);
        orderTSP180.add(6, exel.get(40));
        if ((double) exel.get(41) < tsp360) orderTSP180.add(7, tsp360 - (double) exel.get(41));
        else orderTSP180.add(7,0);
        orderTSP180.add(8, exel.get(42));
        if ((double) exel.get(43) < tsp440) orderTSP180.add(9, tsp440 - (double) exel.get(43));
        else orderTSP180.add(9,0);
        orderTSP180.add(10, exel.get(44));
        if ((double) exel.get(45) < tsp520) orderTSP180.add(11, tsp520 - (double) exel.get(45));
        else orderTSP180.add(11,0);
        orderTSP180.add(12, exel.get(46));
        if ((double) exel.get(47) < tsp600) orderTSP180.add(13, tsp600 - (double) exel.get(47));
        else orderTSP180.add(13,0);
        orderTSP180.add(14, exel.get(48));
        if ((double) exel.get(49) < tsp720) orderTSP180.add(15, tsp720 - (double) exel.get(49));
        else orderTSP180.add(15,0);
        orderTSP180.add(16, exel.get(50));
        if ((double) exel.get(51) < tsp840) orderTSP180.add(17, tsp840 - (double) exel.get(51));
        else orderTSP180.add(17,0);
        orderTSP180.add(18, exel.get(52));
        if ((double) exel.get(53) < tsp1000) orderTSP180.add(19, tsp1000 - (double) exel.get(53));
        else orderTSP180.add(19,0);
        orderTSP180.add(20, exel.get(54));
        if ((double) exel.get(55) < tsp1200) orderTSP180.add(21, tsp1200 - (double) exel.get(55));
        else orderTSP180.add(21,0);
        orderTSP180.add(22, exel.get(56));
        if ((double) exel.get(57) < tsp1300) orderTSP180.add(23, tsp1300 - (double) exel.get(57));
        else orderTSP180.add(23,0);
        orderTSP180.add(24, exel.get(58));
        if ((double) exel.get(59) < tsp1500) orderTSP180.add(25, tsp1500 - (double) exel.get(59));
        else orderTSP180.add(25,0);
        orderTSP180.add(26, exel.get(60));
        if ((double) exel.get(61) < tsp1680) orderTSP180.add(27, tsp1680 - (double) exel.get(61));
        else orderTSP180.add(27,0);
        orderTSP180.add(28, exel.get(62));
        if ((double) exel.get(63) < tsp2000) orderTSP180.add(29, tsp2000 - (double) exel.get(63));
        else orderTSP180.add(29,0);
        orderTSP180.add(30, exel.get(64));
        if ((double) exel.get(65) < tsp2400) orderTSP180.add(31, tsp2400 - (double) exel.get(65));
        else orderTSP180.add(31,0);


    }


    public double getTsp90() {
        return tsp90;
    }

    public void setTsp90(double tsp90) {
        this.tsp90 = tsp90;
    }

    public double getTsp180() {
        return tsp180;
    }

    public void setTsp180(double tsp180) {
        this.tsp180 = tsp180;
    }

    public double getTsp260() {
        return tsp260;
    }

    public void setTsp260(double tsp260) {
        this.tsp260 = tsp260;
    }

    public double getTsp360() {
        return tsp360;
    }

    public void setTsp360(double tsp360) {
        this.tsp360 = tsp360;
    }

    public double getTsp440() {
        return tsp440;
    }

    public void setTsp440(double tsp440) {
        this.tsp440 = tsp440;
    }

    public double getTsp520() {
        return tsp520;
    }

    public void setTsp520(double tsp520) {
        this.tsp520 = tsp520;
    }

    public double getTsp600() {
        return tsp600;
    }

    public void setTsp600(double tsp600) {
        this.tsp600 = tsp600;
    }

    public double getTsp720() {
        return tsp720;
    }

    public void setTsp720(double tsp720) {
        this.tsp720 = tsp720;
    }

    public double getTsp840() {
        return tsp840;
    }

    public void setTsp840(double tsp840) {
        this.tsp840 = tsp840;
    }

    public double getTsp1000() {
        return tsp1000;
    }

    public void setTsp1000(double tsp1000) {
        this.tsp1000 = tsp1000;
    }

    public double getTsp1200() {
        return tsp1200;
    }

    public void setTsp1200(double tsp1200) {
        this.tsp1200 = tsp1200;
    }

    public double getTsp1300() {
        return tsp1300;
    }

    public void setTsp1300(double tsp1300) {
        this.tsp1300 = tsp1300;
    }

    public double getTsp1500() {
        return tsp1500;
    }

    public void setTsp1500(double tsp1500) {
        this.tsp1500 = tsp1500;
    }

    public double getTsp1680() {
        return tsp1680;
    }

    public void setTsp1680(double tsp1680) {
        this.tsp1680 = tsp1680;
    }

    public double getTsp2000() {
        return tsp2000;
    }

    public void setTsp2000(double tsp2000) {
        this.tsp2000 = tsp2000;
    }

    public double getTsp2400() {
        return tsp2400;
    }

    public void setTsp2400(double tsp2400) {
        this.tsp2400 = tsp2400;
    }


    public ArrayList<Object> getOrderTSP180() {
        return orderTSP180;
    }

    /**
     * Список для заявки
     */
    private ArrayList<Object> orderTSP180 = new ArrayList<>(32);
    /*
    Минимальные остатки для создание заявки
     */
    private double tsp90 = 0;

    private double tsp180 = 0;
    private double tsp260 = 0;
    private double tsp360 = 0;
    private double tsp440 = 0;
    private double tsp520 = 0;
    private double tsp600 = 0;
    private double tsp720 = 0;
    private double tsp840 = 0;
    private double tsp1000 = 0;
    private double tsp1200 = 0;
    private double tsp1300 = 0;
    private double tsp1500 = 0;
    private double tsp1680 = 0;
    private double tsp2000 = 0;
    private double tsp2400 = 0;

}
