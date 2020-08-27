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
        Employee emp1 = new Employee(123, "John", 120.00);
        System.out.println("emp object: " + emp1);
        int id = emp1.getEmpId();
        System.out.println("Emp id: " + id);
        System.out.println("Emp Name: " + emp1.getEmpName());
        System.out.println("Emp Salary: " + emp1.getEmpSalary());
        //Invoke setempName
        emp1.setEmpName("Jimmy");
        System.out.println("Changed Emp Name: " + emp1.getEmpName());
        System.out.println("emp object: " + emp1);
        emp1.setEmpSalary(150);
        System.out.println("Changed salary: "+emp1.getEmpSalary());
        System.out.println("emp object: " + emp1);
        
        double netSal = emp1.CalcNetSalary(.15);
        System.out.println("Net Sal: "+netSal);

    }

}
