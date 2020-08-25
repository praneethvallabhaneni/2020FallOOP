/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dogs;

/**
 *
 * @author ajay
 */
public class Dog {
    private int dogAge;
    private String dogName;
    private String dogBreed;
    
    public Dog(int dogAgeIn, String dogNameIn, String dogBreedIn){
        dogAge = dogAgeIn;
        dogName = dogNameIn;
        dogBreed = dogBreedIn;
    }
    
    public int incrementAge(){
        return dogAge++;
    }
    
    public char getDogFristChar(){
        return dogName.charAt(0);
    }
    
}
