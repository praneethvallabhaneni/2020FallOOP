/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo;

import java.time.DayOfWeek;

/**
 *
 * @author ajay
 */
public class PizzaCostDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PizzaCost pizza = PizzaCost.MEDIUM;
        System.out.println(pizza.getPrice());
        
        System.out.println("********");
        for(PizzaCost pizza1:PizzaCost.values()){
            System.out.println(pizza1.getPrice());
        }
        
        System.out.println("************");
        for(PizzaCost pizzas:PizzaCost.values()){
            double finalPrice = pizzas.getPrice()-
                    (pizzas.getPrice()* pizzas.getDiscount());
            System.out.println(finalPrice);
        }
        
        System.out.println("************");
        DayOfWeek day = DayOfWeek.FRIDAY;
        System.out.println(day);
        
        System.out.println("************");
        for(Toppings toppings:Toppings.values()){
            double tPrice =toppings.getExtraToppingPrice();
            System.out.println(tPrice);
        }
            
        
    }
    
}
