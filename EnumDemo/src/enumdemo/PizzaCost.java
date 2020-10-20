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
public enum PizzaCost {
    LARGE(10, 0.0), MEDIUM(7, 0.0), SMALL(5, 0.0);
    
    private double price;
    private double discount;

    public double getDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }

    private PizzaCost(double price, double discount) {
        this.price = price;
        this.discount = discount;
    }


    
}
