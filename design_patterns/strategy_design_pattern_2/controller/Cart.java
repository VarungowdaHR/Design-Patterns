package design_patterns.strategy_design_pattern_2.controller;

import design_patterns.strategy_design_pattern_2.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    public  Cart(){
        products=new ArrayList<>();
    }

    public void addItem(Product product){
        products.add(product);
        System.out.println(product.getName()+" added to cart");
    }

    public void removeItem(Product product){
        products.remove(product);
        System.out.println(product.getName()+" removed from cart");
    }

    private double calculateAmount(){
        double sum=0.0;
        for(Product i:products){
            sum+=i.getCost();
        }
        return sum;
    }

    public void pay(Payment payment){
        double amount=calculateAmount();
        payment.pay(amount);
    }

}
