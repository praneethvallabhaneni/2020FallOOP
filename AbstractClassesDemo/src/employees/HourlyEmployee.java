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
public class HourlyEmployee extends Employee{
    private int hrsWrkd;
    private double wageRate;

    public HourlyEmployee(int hrsWrkd, double wageRate, String empName, int id) {
        super(empName, id);
        this.hrsWrkd = hrsWrkd;
        this.wageRate = wageRate;
    }

    public int getHrsWrkd() {
        return hrsWrkd;
    }

    public void setHrsWrkd(int hrsWrkd) {
        this.hrsWrkd = hrsWrkd;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "hrsWrkd=" + hrsWrkd + ", wageRate=" + wageRate + '}';
    }

    @Override
    public double calcSalary() {
        return 1.2;
    }
    

    
}
