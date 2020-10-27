/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author ajay
 */
public class EmpDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Employee emp1 = new Employee("AB", 123);
        
        Employee emp2 = new FullTimeEmployee("Staff", 21, "John", 43);
        System.out.println(emp2.calcSalary());
    }
    
}
