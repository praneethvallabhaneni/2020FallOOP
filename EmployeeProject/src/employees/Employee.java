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
public class Employee {
    
    private int empId;
    private String empName;
    private double empSalary;
    
    public Employee(int empIdIn, String empNameIn, double empSalaryIn){
        empId = empIdIn;
        empName = empNameIn;
        empSalary = empSalaryIn;
    }
    
    public int getEmpId(){
        return empId;
    }
    
    public String getEmpName(){
        return empName;
    }
    
    public double getEmpSalary(){
        return empSalary;
    }
    
    public void setEmpId(int changedEmpId){
        empId = changedEmpId;
    }
    
    public void setEmpName(String empNameIn){
        empName = empNameIn;
    }
    
    public void setEmpSalary(double empSalaryIn){
        empSalary = empSalaryIn;
    }
    
    public double CalcNetSalary(double taxPercentage){
        empSalary = empSalary-(empSalary*taxPercentage);
        return empSalary;
    }
    
    public String toString(){
        return empId+"--"+empName+"--"+empSalary;
    }
         
    
}
