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
public class Triangle {
    private double side1, side2, side3;
    private double aside1, aside2, aside3;
    
    Triangle(double side1, double side2, double side3) 
            throws IllegalArgumentException
    {
        if(isValid(side1, side2, side3))
        {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            setAngles();
        }
        else
        {
            throw new IllegalArgumentException("Conjunto de lados nao formam um "
                    + "triangulo!");
        }
    }
    
    private boolean isValid(double a, double b, double c)
    {
        return (Math.abs(b - c) < a && a < b + c
                && Math.abs(a - c) < b && b < a + c
                && Math.abs(a - b) < c && c < a + b);
    }
    
    private void setAngles()
    {
        double aux1 = ((side1 * side1) - (side2 * side2) - (side3 * side3))
                /(-2*side2*side3);
        aside1 = Math.acos(aux1) * 57.295779513;
        aux1 = ((side2 * side2) - (side1 * side1) - (side3 * side3))
                /(-2*side1*side3);
        aside2 = Math.acos(aux1) * 57.295779513;
        aux1 = ((side3 * side3) - (side1 * side1) - (side2 * side2))
                /(-2*side1*side2);
        aside3 = Math.acos(aux1) * 57.295779513;
    }
    
    public String printAngles()
    {
        return aside1 + ", " + aside2 + ", " + aside3;
    }
    public double getPerimeter()
    {
        return side1 + side2 + side3;
    }
    
    private double getSemiPerimeter()
    {
        return getPerimeter()/2;
    }
    
    public double getArea()
    {
        double p = getSemiPerimeter();
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    
    private boolean isEquilatero()
    {
        return side1 == side2 && side2 == side3;
    }
    
    private boolean isEscaleno()
    {
        return side1 != side2 && side2 != side3 && side1 != side3;
    }
    
    private boolean isRetangulo()
    {
        return Math.round(aside1) == 90 || Math.round(aside2) == 90 ||
                Math.round(aside3) == 90;
    }
    
    private boolean isObtusangulo()
    {
        return aside1 > 90 || aside2 > 90 || aside3 > 90;
    }
    
    private String getType()
    {
        String aux = "";
        if(isEquilatero())
        {
            aux += "Equilatero";
        }
        else if (isEscaleno())
        {
            aux += "Escaleno";
        }
        else
        {
            aux += "Isoceles";
        }
        
        aux += " e ";
        
        if(isRetangulo())
        {
            aux += "Retangulo";
        }
        else if(isObtusangulo())
        {
            aux += "Obtusangulo";
        }
        else
        {
            aux += "Acutangulo";
        }
        
        return aux;
    }
    
    private String getSides()
    {
        return side1 + ", " + side2 + ", " + side3;
    }
    
    @Override
    public String toString()
    {
        return "Lados = " + getSides() + "\n"
                + "Perimetro = " + getPerimeter() + "; Area = " + getArea()
                + "\nAngulos = " + printAngles()
                + "\nTipo = " + getType();
    }
}
