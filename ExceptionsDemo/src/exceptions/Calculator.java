/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author ajay
 */
public class Calculator {
    private int numA;
    private int numB;

    public Calculator(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int add(){
        return numA + numB;
    }
    
    public int sub(){
        return numA - numB;
    }
    /**
     * 
     * @return
     * @throws BandiException 
     */
    public int mul() throws BandiException{
        if(numA >=0){
            throw new BandiException("This is an example of IOException");
        }
        return numA * numB;
    }
    /**
     * 
     * @return 
     */
    public int div(){
        if(numB == 0){
            throw new ArithmeticException("Divisible by 0 is not possible");
        }
        if(numB <=0){
            throw new NegativeNumberException("We may not consider the result");
        }
        return numA/numB;
    }
   
}
