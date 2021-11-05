package com.company;

public class DateTest{
    public static void main(String[] args){


        Date t1 = new Date(12, 1, 2000);

        do{
            t1.nextDay();
            System.out.printf("%s\n", t1.toString());
        }
        while(t1.getYear() != 2021);
    }
}