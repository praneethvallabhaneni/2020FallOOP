/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Praneeth Vallabhaneni
 */
public class RandomArray {
    public static void main(String[] args) {
        int randomNumbers[] = new int[100];
         Random rand = new Random(); 
        for(int i=0;i<100;i++)
        {
            randomNumbers[i]=rand.nextInt();
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index value:");
        int index=sc.nextInt();
        if(index>99)
        {
            System.out.println("Index out of bound");
        }
        else
        {
            System.out.println(randomNumbers[index]);
        }
    }
    
}
