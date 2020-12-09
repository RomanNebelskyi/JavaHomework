package hw;
import java.lang.Math;
public class Circle
{

    private double radius;
    private double diameter;


    Circle(double radius, double diameter)
    {
        if(Math.abs(diameter - 0 )> 0.000001)
        {
            this.diameter = radius*2.0;
        }

        if(Math.abs(radius - 0 )> 0.000001)
        {
        this.radius = diameter/2.0;
        }

        if(diameter!=2*radius)
        {
            System.out.println("Error. Radius = diameter/2");
        }
        this.diameter = diameter;
        this.radius = radius;

    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        if(radius>0)
        {
            this.radius = radius;
            this.diameter = radius * 2;
        }
        else
            System.out.println("Wrong parameter.");
    }

    public double getDiameter()
    {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if(diameter>0)
        {
            this.diameter = diameter;
            this.radius = diameter / 2;
        }
        else
            System.out.println("Wrong parameter.");

    }
     public double getSquare()
    {

        return diameter/2.0 * Math.PI;
    }
    public double getLength()
    {
        return radius*2.0 * Math.PI;

    }

}
