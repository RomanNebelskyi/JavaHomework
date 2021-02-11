package Soft.hw17;

import java.io.Serializable;

public class EmployeeNoSalary implements Serializable
{
    private transient int salary;
    private String name;
    private int id;


    public EmployeeNoSalary()
    {



    }

    @Override
    public String toString() {
        return "EmployeeNoSalary{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmployeeNoSalary(int salary, String name, int id) {
        this.salary = salary;
        this.name = name;
        this.id = id;
    }
}
