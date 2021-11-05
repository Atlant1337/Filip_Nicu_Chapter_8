package com.company;

public class RectangleTest {
        public static void main(String[] args) {
            Rectangle r1 = new Rectangle();
            r1.setLength(7);
            r1.setWidth(3);
            System.out.printf("Area is: %.2f%n", r1.area(r1.getLength(), r1.getWidth()));
            System.out.printf("Perimeter is: %.2f%n", r1.perimeter(r1.getLength(), r1.getWidth()));
    }
}