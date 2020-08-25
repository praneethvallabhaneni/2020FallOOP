/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dogs;

/**
 *
 * @author ajay
 */
public class DogDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d1 = new Dog(12, "Jack", "Rodweiler");
        char c = d1.getDogFristChar();
        System.out.println(c);
        System.out.println("First char: "+d1.getDogFristChar());
        
        int age = d1.incrementAge();
        System.out.println("Age: "+age);
        System.out.println("Age: "+d1.incrementAge());

        
    }
    
}
