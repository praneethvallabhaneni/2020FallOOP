/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author ajay
 */
public class Car {
    private long vNo;
    private String model;
    private boolean automatic;
    
    
    public Car(long vIn, String modelIn, boolean automaticIn){
        this.vNo = vIn;
        this.model = modelIn;
        this.automatic = automaticIn;
    }
    
//    public Car(){
//        vNo = -99;
//        model = "Not invented!";
//        automatic = false;
//    }
    
    public Car(){
        this (-99, "Not invented!", false);
    }

    public Car(String modelIn){
        this.model = modelIn;
    }
    
    public Car(long vNo, boolean automatic){
        this.vNo = vNo;
        this.automatic = automatic;
    }
    
    public long getVInNo(){
        return this.vNo;
    }
    
    public String getModel(){
        return model;
    }
    
    public boolean isAutomatic(){
        return automatic;
    }
    
    public void setVno(long vNoIn){
        this.vNo = vNoIn;
    }
    
    public void setModel(String model){
        this.model = model;
    }
    
    public void setAutomatic (boolean automatic){
        this.automatic = automatic;
    }
    
    public String toString(){
        return vNo+"-"+model+"-"+automatic;
    }
    
    
}
