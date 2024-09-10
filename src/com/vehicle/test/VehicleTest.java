package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[] args) {

        Car car = new Car();

        car.setSpeed(100.0);
        car.drive(6000);
        car.setFuelLevel(60.0f);


        ElectricCar electricCar = new ElectricCar();
        electricCar.setSpeed(110.0);
        electricCar.setFuelLevel(70.0f);
        electricCar.setBatteryLevel(50.0);
        electricCar.drive(20000);

        System.out.println("Car:");
        System.out.println("Speed in mph: " + car.getSpeedMph());
        System.out.println("Distance traveled in km: " + car.getDistanceKm());
        System.out.println("Remaining fuel percentage: " + car.calculateRemainingFuel(6000) + "%");

        System.out.println("\nElectricCar:");
        System.out.println("Speed in mph: " + electricCar.getSpeedMph());
        System.out.println("Distance traveled in km: " + electricCar.getDistanceKm());
        System.out.println("Remaining fuel percentage: " + electricCar.calculateRemainingFuel(20000) + "%");
        System.out.println("Remaining battery level: " + electricCar.getBatteryLevel() + "%");
    }
}

