/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author ajay
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Grocerylist
        
        ArrayList<String> groList = new ArrayList<String>();
        
        String str = "Java";
        String str1 = new String("NW");
        groList.add("Tomatoes");
        groList.add("Onions");
        groList.add("Beer");
        groList.add("Chips");
        groList.add(1, "Water");
        groList.set(2, "Eggs");
        groList.add("Bread");
        groList.add("Cake");
        groList.remove(1);
        //System.out.println(groList.get(4));
        //groList.get(5);
        groList.add(5, "Potatoes");
        groList.add("Cilantro");
        groList.set(7, "Spinach");
        groList.add(10, "Mushroom");
        
        
        System.out.println(groList.size());
        
        for(String grocery: groList){
            System.out.println(grocery);
        }
        System.out.println("******************");
        for(int i =0; i<groList.size(); i++){
            System.out.println(groList.get(i));
        }
        
        ArrayList<Integer> myInts = new ArrayList<Integer>();
        myInts.add(2);//implicitly take it as new Integer(2);
        myInts.add((31));
        
        System.out.println("****************");
        ArrayList<Dog> myDogs = new ArrayList<Dog>();
        Dog d2 = new Dog ("Jimmy", "Pug", 5);
        myDogs.add(new Dog("Puppy", "Pomerian", 3));
        myDogs.add(d2);
        
        for(Dog d:myDogs){
            System.out.println(d);
        }
        
        
    }
    
}
