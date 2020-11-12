/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author ajay
 */
public class CalculatorDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Calculator calc = new Calculator(-5, 0);
        System.out.println("Add: " + calc.add());
        System.out.println("Sub: " + calc.sub());
        try {
            System.out.println("Div: " + calc.div());
        } catch (ArithmeticException | NegativeNumberException ex) {
            System.out.println(ex.getMessage());
        }
//          catch (NegativeNumberException ex) {
//            System.out.println(ex.getMessage());
//        }
        System.out.println("I am done!");
        try {
            System.out.println("Mul: " + calc.mul());
        } catch (BandiException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
