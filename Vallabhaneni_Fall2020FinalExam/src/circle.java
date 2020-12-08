/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praneeth Vallabhaneni
 */
public class circle {

    private double x;
    
     circle(double x) {
        this.x = x;
    }
    
    public double getArea(){
        double pi = 3.14;
        return pi*x*x;
    }
}
    

