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
public class FullGA extends GradauteAssistant {

    public FullGA(String name, String ssn) {
        super(name, ssn);
    }
    
    
    
    @Override
    public double calcMonthlyPay() {
        return PAY;
    }

    @Override
    public double calcMonthlyTax() {
        return 0.1*calcMonthlyPay();
    }

    @Override
    public double salaryWithTax() {
        return PAY-calcMonthlyTax();
    }
    
    
    
}
