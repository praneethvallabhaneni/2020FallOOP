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
public abstract class GradauteAssistant implements Payable{
    private String name;
    private String ssn;

    public GradauteAssistant(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

     
    @Override
    public String toString(){
        return  "Name of GA: "+getName()+"\n"+
                "SSN of GA: "+getSsn()+"\n"+
                "Monthly Pay: "+calcMonthlyPay()+"\n"+
                "Monthly Tax: "+ calcMonthlyTax()+"\n"+
                "Salary with Tax: "+salaryWithTax()+"\n"+
                "*********************" ;
                
    }
}
