package com.vehicle;
public class ElectricCar extends Car {
    private double batteryLevel;

    public void setBatteryLevel(double battery) {
        this.batteryLevel = battery;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void drive(int distance) {
        super.drive(distance);
        double killometersDriven=distance/1000.0;
        batteryLevel -= (killometersDriven/ 1000.0)*1;
        if(batteryLevel < 0)
        {
            batteryLevel=0;
        }
    }
}