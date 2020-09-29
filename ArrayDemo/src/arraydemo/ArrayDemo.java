/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

/**
 *
 * @author ajay
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers;
        numbers = new int[5];//5 from 0 to 4
        
        numbers[3] = 890;
         
//        for(int i= 0; i<numbers.length; i++){
//            numbers[i] = 2*i;
//        }
        
        
        //print the array
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);                    
        }
        System.out.println("*****************");
        Faculty[] myDept;
        myDept = new Faculty[2];
        
        Faculty f1 = new Faculty("Ajay", "Bandi",919);
        myDept[0] = f1;
        
        myDept[1] = new Faculty("Denise", "Case", 9129);
        
        for(int i=0; i<myDept.length; i++){
            System.out.println(Math.sqrt(myDept[i].getID()));
        }
        
        System.out.println("****************");
        //enhanced for loop
        
        for(int num:numbers){
            System.out.println(num);
        }
        System.out.println("****************");
        for(Faculty f:myDept){
            System.out.println(f.getFirstName());
        }
    }
    
}
