package design_patterns.strategy_design_pattern_2.paymentAlgos;

import design_patterns.strategy_design_pattern_2.controller.Payment;

public class PayPalAlgo implements Payment {
    private String name;
    private String cardNumber;

    public PayPalAlgo(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public  void pay(double amount){
        System.out.printf("%s paid %f via PayPal%n", name, amount);
    }
}
