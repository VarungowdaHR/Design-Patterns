package design_patterns.strategy_desing_pattern.controller;

public abstract class BaseAmountCalculator {
    public abstract double calculateAmount(double originalPrice, int itemsCount);
}
