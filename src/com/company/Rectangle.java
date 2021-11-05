package com.company;

public class Rectangle {
        double w;
        double l;
        public Rectangle() {
            w = 1;
            l = 1;
        }
        public double getWidth() {
            return w;
        }

        public void setWidth(double width) {
            if (width > 0.0 && width <= 20.0)
                this.w = width;
        }
        public double getLength() {
            return l;
        }

        public void setLength(double length) {
            if(length > 0.0 && length <= 20.0)
                this.l = length;
        }
        double perimeter (double l, double w){
            return 2 * (l + w);
        }
        double area (double l, double w){
            return l * w;
        }
    }