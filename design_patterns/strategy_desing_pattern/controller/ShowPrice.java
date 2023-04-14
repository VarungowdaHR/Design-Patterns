package design_patterns.strategy_desing_pattern.controller;

public class ShowPrice {
     public BaseAmountCalculator bac;
     public void showprice(double price, int itemsCount){
         System.out.println("Amount to be pay "+ bac.calculateAmount(price, itemsCount));
     }
}
