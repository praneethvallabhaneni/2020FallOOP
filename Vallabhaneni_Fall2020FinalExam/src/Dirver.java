


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praneeth Vallabhaneni
 */
public class Dirver {
    
    public static void main(String[] args) {
        GeometricObject squareObj1 = new Square(2);
        Square squareObj2 = new Square(3);
        Square squareObj3 = new Square(4);
        Square squareObj4 = new Square(5);
        Square squareObj5 = new Square(6);
        GeometricObject geoObj[] = new GeometricObject[5];
        geoObj[0] = squareObj1;
        geoObj[1] = squareObj2;
        geoObj[2] = squareObj3;
        geoObj[3] = squareObj4;
        geoObj[4] = squareObj5;
        
        for(int i=0;i<geoObj.length;i++){
            if(geoObj[i] instanceof Colorable)
            {
                System.out.println("Area "+geoObj[i].calculateArea(geoObj[i].getSide()));
                geoObj[i].howToColor();
            }
        }
        
    }
    
}
