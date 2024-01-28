package StrategyDesignPattern;

import StrategyDesignPattern.Strategy.DriveStrategy;

public class Vehicle {
    //constructor injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    DriveStrategy driveStrategy;

    public void drive() {
        driveStrategy.drive();
    }
}
