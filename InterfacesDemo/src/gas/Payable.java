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
public interface Payable {
    public static final double PAY = 750.00;
    public abstract double calcMonthlyPay();
    double calcMonthlyTax();
    double salaryWithTax();
}
