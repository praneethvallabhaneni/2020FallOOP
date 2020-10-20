/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo;

/**
 *
 * @author ajay
 */
public enum Toppings {
    RED_ONION(0, 0.50), BELL_PEPPERS(0, 0.50), OLIVES(0, 0.50);
    
    private double toppingPrice;
    private double extraToppingPrice;

    private Toppings(double toppingPrice, double extraToppingPrice) {
        this.toppingPrice = toppingPrice;
        this.extraToppingPrice = extraToppingPrice;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

    public double getExtraToppingPrice() {
        return extraToppingPrice;
    }
    
    
    
}
