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
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp1 = new Employee("John", "Smith", "854-98-5612");
        System.out.println(emp1.toString());
        
        HourlyEmployee hrEmp1 = new HourlyEmployee("Byron", "Williams", "123-432-3444", 12, 10);
        System.out.println(hrEmp1.toString());
        
        //emp1 = hrEmp1;//legal statement //polymorphic sub
        //hrEmp1 = emp1;//illegal statement
        
        Employee emp2 = new HourlyEmployee("H", "P ", "13", 12, 5);
        System.out.println(emp2.toString());
        
        
        
    }
    
}
