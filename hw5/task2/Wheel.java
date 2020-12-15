package hw5.task2;

public class Wheel
{
    private int size;
    private String model;
    private String season;

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", model='" + model + '\'' +
                ", season='" + season + '\'' +
                '}';
    }



    public void wheels2X()
    {
    this.size *=2;

    }

    public void changeTiresTo ()
    {
    if(this.season.equalsIgnoreCase("winter"))
        this.season  = "summer";

    else if(this.season.equalsIgnoreCase("summer"))
        this.season = "winter";

    else
        System.out.println("Your tires are all-season");
    }



    public Wheel(int size, String model, String season)
    {
        this.size = size;
        this.model = model;
        this.season = season;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getSeason()
    {
        return season;
    }

    public void setSeason(String season)
    {
        this.season = season;
    }
}
