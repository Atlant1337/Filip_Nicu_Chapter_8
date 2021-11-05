package com.company;

public enum TrafficLight {
    RED(60),
    YELLOW(5),
    GREEN(60);

    private int time;
    TrafficLight(int t) {
        this.time = t;
    }

    public int getTime(){
        return time;
    }
}