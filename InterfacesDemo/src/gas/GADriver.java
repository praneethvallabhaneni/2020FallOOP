/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas;

/**
 *
 * @author ajay
 */
public class GADriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FullGA fga = new FullGA("John", "1243");
        System.out.println(fga);
        
        HalfGA hga = new HalfGA("Jimmy", "653");
        System.out.println(hga);
        
        //Polymorphism - super instance = sub instance
        //Gradaute Assistant is a super class
        //FullGA and HalfGA are subclasses
        GradauteAssistant ga = new FullGA("A", "1");
        System.out.println(ga);
        
        Payable p = new FullGA("ASD", "45");
        System.out.println(p);
    }
    
}
