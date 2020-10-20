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
public class HourlyEmployee extends Employee {
    private int hrsWorked;
    private double wage;

    public HourlyEmployee(String fName, String lName, String ssn, int hrsWorked, double wage) {
        super(fName, lName, ssn);
        this.hrsWorked = hrsWorked;
        this.wage = wage;
    }

    public int getHrsWorked() {
        return hrsWorked;
    }

    public void setHrsWorked(int hrsWorked) {
        this.hrsWorked = hrsWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    
    public double calcSalary(){
        return hrsWorked*wage;
    }
    
    @Override
    public String getFullName(){
        return super.getlName()+","+super.getfName();
    }

    @Override
    public String toString() {
        return super.toString()+" $" +calcSalary();
    }
        
    
}
