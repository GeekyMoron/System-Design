package StrategyDesignPattern.Strategy;

public class SportDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("We have Sport Drive Strategy");
    }
}
