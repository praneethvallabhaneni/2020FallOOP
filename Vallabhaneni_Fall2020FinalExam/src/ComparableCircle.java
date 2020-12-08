/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praneeth Vallabhaneni
 */
class ComparableCircle extends circle implements Comparable<ComparableCircle> {

  ComparableCircle(double radius){
	 super(radius);
  }
	
  @Override
  public int compareTo(ComparableCircle to){
      double myArea = super.getArea();
      double yourArea = to.getArea();
      
      if (myArea > yourArea) return 1;
      else if(myArea < yourArea) return -1;
      else return 0;
      
  }
}


