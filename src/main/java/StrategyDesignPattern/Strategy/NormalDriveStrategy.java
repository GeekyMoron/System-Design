package StrategyDesignPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("We have Normal Drive Strategy");
    }
}
