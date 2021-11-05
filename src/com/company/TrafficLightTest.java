package com.company;

public class TrafficLightTest {
    public static void main(String[] args) {
        System.out.println("Traffic Light Times:");
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s       %d seconds\n", light, light.getTime());
        }
    }
}