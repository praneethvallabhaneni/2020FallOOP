/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praneeth Vallabhaneni
 */
public class Employee implements Comparable<Employee>{
    private String empId;private String empName;private double empSalary;

    public Employee(String empId, String empName, double empSalary) {
        this.empId= empId;
        this.empName= empName;
        this.empSalary= empSalary;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }
    
    
    
    @Override
    public int compareTo(Employee obj) {
        return empId.compareTo(obj.empId);
    }

    @Override
    public String toString() {
        return empId + " " + empName + " " + empSalary;
    }
}
