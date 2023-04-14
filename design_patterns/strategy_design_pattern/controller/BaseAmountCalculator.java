package design_patterns.strategy_design_pattern.controller;

public abstract class BaseAmountCalculator {
    public abstract double calculateAmount(double originalPrice, int itemsCount);
}
