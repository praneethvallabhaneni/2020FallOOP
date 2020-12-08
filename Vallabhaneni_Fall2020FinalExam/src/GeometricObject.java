/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Praneeth Vallabhaneni
 */
public class GeometricObject implements Colorable {
    
    private double side;

    public double getSide() {
        return side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
    public void setSide(double side) {
        this.side = side;
    }
    
    public double calculateArea(double side)
    {
        return side;
    }
    
}
