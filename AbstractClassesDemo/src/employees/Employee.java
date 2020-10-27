package employees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajay
 */
public abstract class Employee {
    private String empName;
    private int id;

    public Employee(String empName, int id) {
        this.empName = empName;
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "empName=" + empName + ", id=" + id + '}';
    }
    
    public abstract double calcSalary();
    
}
