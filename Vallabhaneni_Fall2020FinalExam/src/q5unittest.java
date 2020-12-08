/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praneeth Vallabhaneni
 */
public class q5unittest {
         public static void main(String []args){
        
      ComparableCircle c1 = new ComparableCircle(2);
      ComparableCircle c2 = new ComparableCircle(4);
        
      int ret = c1.compareTo(c2);
      if (ret > 0){
          System.out.println("c1 > c2");
      }
      else if (ret < 0){
          System.out.println("c1 < c2");
      }
      else {
          System.out.println("c1 == c2");
      }
      
      
     }
}
    

