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
public class Circle extends Point{

    private double radius;
    private String color;
    private double length;


    public Circle() {
        radius = 1.0;
        color = "red";
        setLength();
    }


    public Circle(double radius) {
        this(); 
        this.radius = radius;
        setLength();
    }

    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
        setLength();
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI; 
    }

    public double getLength()
    {
        return length;
    }

    public String getColor()
    {
        return color;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
        setLength();
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    private void setLength()
    {
        this.length = 2 * Math.PI * this.radius;
    }

    @Override
    public String toString()
    {
        return "Circulo: raio = " + radius + "; cor = " + color
                + "; comprimento = " + length + "; area = " + getArea() +
                super.toString();
    }
}

