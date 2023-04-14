package design_patterns.strategy_desing_pattern.controller.model;

import design_patterns.strategy_desing_pattern.controller.BaseAmountCalculator;

public class UgadiOfferPrice extends BaseAmountCalculator {

    @Override
    public double calculateAmount(double originalPrice, int itemsCount) {
        return (originalPrice*itemsCount)*0.8;
    }
}
