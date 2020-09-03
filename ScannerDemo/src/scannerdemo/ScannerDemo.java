/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerdemo;

import java.util.Scanner;

/**
 *
 * @author ajay
 */
public class ScannerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("You entered: "+name);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("You entered: "+age);
        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();
        System.out.println("You entered: "+ salary);
        
    }
    
}
