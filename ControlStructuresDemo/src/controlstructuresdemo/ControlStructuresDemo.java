/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructuresdemo;

/**
 *
 * @author ajay
 */
public class ControlStructuresDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        boolean status = ControlStructuresDemo.isEligibleToVote(100);
        System.out.println(status);
        
        String fruit ="Mango";
        String message = "";
        
        switch(fruit){
            case "Watermelon":
                message = "WM";
                System.out.println(message);
            case "Mango":
                System.out.println("Mango"); 
               break;                
            case "Banana":
                message = "B";
                System.out.println(message);
                break;
            default:
                message = "tomato"; 
                System.out.println(message);
        }
        
        int numHours = 12;
//        if(numHours == 1){
//            System.out.println(numHours+" hour");
//        }
//        else{
//            System.out.println(numHours+" hours");
//        }
        
       String message1 = (numHours == 1) ? numHours+" hours" : numHours+" hour";
       System.out.println(message1); 
        
       double score =90;
       
       if(score >= 90){
           System.out.println("A");
       }
       else if(score >=80 && score <90){
           System.out.println("B");
       }
       else if(score >=70 && score <80){
           System.out.println("C");
       }
       
       double income = 45000;
       income = income-income*0.2;
       double income1 = income-(income*0.2);
       System.out.println("income: "+income);
       System.out.println("income1: "+income1);
            
       
    }
    
    public static boolean isEligibleToVote(int age){
        return age >= 18;
    }
    
}
