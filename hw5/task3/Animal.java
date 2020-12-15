package hw5.task3;

public class Animal
{
    private String name;
    private int speed;
    private int age;
    Animal(){

    }
    Animal(String name, int speed, int age)
    {
        this.age = age;
        this.name = name;
        this.speed = speed;
    }

    public String getAllParams()
    {
        System.out.println("-------------------------------\n");
        return "Name is " + name+ ", age is " + age+
                " , speed is "+ speed ;
    }
    public void setAllParams(String name, int speed, int age)
    {
        this.age = age;
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
