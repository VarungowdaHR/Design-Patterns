package design_patterns;

import design_patterns.strategy_design_pattern.controller.ShowPrice;
import design_patterns.strategy_design_pattern.model.DassaraSpecialPrice;
import design_patterns.strategy_design_pattern.model.UgadiOfferPrice;
import design_patterns.strategy_design_pattern_2.controller.Cart;
import design_patterns.strategy_design_pattern_2.model.Product;
import design_patterns.strategy_design_pattern_2.paymentAlgos.GooglePay;
import design_patterns.strategy_design_pattern_2.paymentAlgos.PayPalAlgo;

public class Main {
    public static void main(String[] args){
        ShowPrice sp=new ShowPrice();

        DassaraSpecialPrice dsp=new DassaraSpecialPrice();
        sp.bac=dsp;
        sp.showprice(500.6, 2);

        UgadiOfferPrice uop=new UgadiOfferPrice();
        sp.bac=uop;
        sp.showprice(600.0, 3);


        Cart cart=new Cart();

        Product laptops=new Product("laptop", 50000.5, "678922");
        Product shirt=new Product("shirt", 250, "837393");
        cart.addItem(laptops);
        cart.addItem(shirt);

        cart.pay(new GooglePay("varun", "672892928762"));
        cart.pay(new PayPalAlgo("kunal", "72929729282"));

    }
}
