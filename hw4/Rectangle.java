package hw;

public class Rectangle
{
    private double length;
    private double width;

    Rectangle()
    {
        this.length = 4;
        this.width = 3;
    }
    Rectangle(double length, double width)
    {
        if(0<length && 0 < width )
        {

            this.length = length;
            this.width = width;
        }
        else
            {
            System.out.println("Error. Paremeters are wrong.");
            }

    }
     public void setLength(double length)
     {
         if(0<length)
         {

             this.length = length;
         }
         else
             {
             System.out.println("Paremeter is wrong");
         }


    }
    public double getLength()
    {
        return length;
    }
    public void setWidth (double width)
    {
        if(0<width)
        {
            this.length = length;
        }
        else
            {
            System.out.println("Paremeter is wrong");
            }
    }

    public double getWidth()
    {
        return width;
    }
    public double getSquare()
    {
        return width * length; // return this.width * this.length; ???????

    }
    public double getPerimeter()
    {

        return 2*(length+width); // return 2*(this.length+ this.width); ???????
    }

}
