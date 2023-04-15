package design_patterns.strategy_design_pattern_2.model;

public class Product {
    private String name;
    private double cost;
    private String upcCode;

    public Product(String name, double cost, String upcCode) {
        this.name = name;
        this.cost = cost;
        this.upcCode = upcCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }



}
