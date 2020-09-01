/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author ajay
 */
public class CarDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c1 = new Car(1324564342, "Honda", true);
        System.out.println(c1.toString());
        System.out.println(c1);
        c1.setAutomatic(false);
        System.out.println(c1);
        c1.setModel("Nissan");
        System.out.println(c1);
        System.out.println(c1.getModel());
        
        Car c2 = new Car(123456, false);
        System.out.println(c2);
        
        Car c3 = new Car();
        System.out.println(c3);
        
        
    }
    
}
