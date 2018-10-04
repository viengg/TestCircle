/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcircle;

/**
 *
 * @author Vien
 */
public class TestCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println(c1.toString());


        Circle c2 = new Circle(2.0);
        System.out.println(c2);

        Circle c3 = new Circle(3.0, "blue");    
        c3.setCoordenadas(3, 5);
        System.out.println(c3);
        
        try{
            Triangle t1 = new Triangle(21, 22, 3);
            System.out.println(t1);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

    }    
}
