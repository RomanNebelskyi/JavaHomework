package hw;



public class MainClass {
    public static void main(String[] args) {
        ///////////////////////////////////////
        Rectangle rectangleDefault = new Rectangle();
        System.out.println("Default params:\nlength = "+ rectangleDefault.getLength()+", width = "+ rectangleDefault.getWidth());

        Rectangle rectangleMain = new Rectangle(5 , 6);
        System.out.println("Our params:\nlength = "+ rectangleMain.getLength()+", width = "+ rectangleMain.getWidth());
        System.out.println();

        rectangleMain.setLength(2); //setting new parameters
        rectangleMain.setWidth(3);
        System.out.println("Square of rec is: "+ rectangleMain.getSquare()+ "\nPerimeter of rec is: "+ rectangleMain.getPerimeter()+ "\n\n");

        ////////////////////////

        Circle newCircle = new Circle(3 , 6);
        System.out.println("Circle is created");

        newCircle.setRadius(4);
        System.out.println("Square of circle is :" + newCircle.getSquare()+ "\nLength of circle is : "+ newCircle.getLength());


    }


}
