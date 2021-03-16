package com.java.code;

public class RoadBike extends Bicycle {

    //In millimetres
    private int tireWidth;

    public RoadBike(int cadence, int gear, int speed, int tireWidth) {
        super(cadence, gear, speed);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("The road bike has a tire width of " + tireWidth + " MM.");
    }
}
