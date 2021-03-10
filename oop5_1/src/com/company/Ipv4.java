package com.company;

public class Ipv4 {
    private int octet1;
    private int octet2;
    private int octet3;
    private int octet4;

    public String showIp(){

        return " " + getOctet1() + "." + getOctet2() + "." + getOctet3() + "." + getOctet4() + " ";
    }

    public int getOctet1() {
        return octet1;
    }

    public void setOctet1(int octet1) {

        if (octet1 > 255 || octet1 < 0){
            octet1 = 0;
        }
        this.octet1 = octet1;
    }

    public int getOctet2() {
        return octet2;
    }

    public void setOctet2(int octet2) {
        if (octet2 > 255 || octet2 < 0){
            octet2 = 0;
        }
        this.octet2 = octet2;
    }

    public int getOctet3() {
        return octet3;
    }

    public void setOctet3(int octet3) {
        if (octet3 > 255 || octet3 < 0){
            octet3 = 0;
        }

        this.octet3 = octet3;
    }

    public int getOctet4() {
        return octet4;
    }

    public void setOctet4(int octet4) {
        if (octet4 > 255 || octet4 < 0){
            octet4 = 0;
        }
        this.octet4 = octet4;
    }
}
