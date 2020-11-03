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
public class HalfGA extends GradauteAssistant {

    public HalfGA(String name, String ssn) {
        super(name, ssn);
    }
    
    
    
    @Override
    public double calcMonthlyPay() {
        return 0.5*PAY;
    }

    @Override
    public double calcMonthlyTax() {
        return 0.07*calcMonthlyPay();
    }

    @Override
    public double salaryWithTax() {
        return calcMonthlyPay()-calcMonthlyTax();
    }
    
}
