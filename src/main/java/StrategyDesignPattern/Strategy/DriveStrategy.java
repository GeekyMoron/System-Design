package StrategyDesignPattern.Strategy;

//the main reason is to avoid duplicates implementation of drive method we will develop all possible ways of implementation in strategy classes.
public interface DriveStrategy {
    abstract void drive();
}
