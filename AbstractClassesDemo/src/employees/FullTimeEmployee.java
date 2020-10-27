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
public class FullTimeEmployee extends Employee {
    private String title;
    private double taxRate;

    public FullTimeEmployee(String title, double taxRate, String empName, int id) {
        super(empName, id);
        this.title = title;
        this.taxRate = taxRate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" + "title=" + title + ", taxRate=" + taxRate + '}';
    }
    
    public double calcSalary(){
        return 10001;
    }
    
}
