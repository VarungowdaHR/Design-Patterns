package design_patterns;

import design_patterns.strategy_design_pattern.controller.ShowPrice;
import design_patterns.strategy_design_pattern.model.DassaraSpecialPrice;
import design_patterns.strategy_design_pattern.model.UgadiOfferPrice;

public class Main {
    public static void main(String[] args){
        ShowPrice sp=new ShowPrice();

        DassaraSpecialPrice dsp=new DassaraSpecialPrice();
        sp.bac=dsp;
        sp.showprice(500.6, 2);

        UgadiOfferPrice uop=new UgadiOfferPrice();
        sp.bac=uop;
        sp.showprice(600.0, 3);

    }
}
