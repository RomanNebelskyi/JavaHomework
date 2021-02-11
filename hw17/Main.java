package Soft.hw17;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/*Створити клас Employee, описати даний клас наступними полями: name, id, salary. Дані поля
повинні бути private. Описати getters and setters. Створити клас Methods де описати всього
два методи serialize() and deserealize().
1).Створити метод Main створити екземпляр класу Employee і провести сереалізацію та
десереалізацію. Результат Десереалізації вивести на консоль.
2). Помітити поле salary модифікатором transient і провести сереалізацію і десереалізацію.
Результат вивести на екран.
3) Створити колекцію об’єктів Employee, провести сереалізацію та десереалізацю колекції
4) Зробити Salary об’єктом, провести сереалізацію та десереалізацю.*/
public class Main
{
    public static void main(String[] args) {



        try
                (
                FileOutputStream fileOutputStream = new FileOutputStream("outputObj.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                FileInputStream fileInputStream = new FileInputStream("outputObj.txt");
                ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
                )
        {
            EmployeeAllFields employee = new EmployeeAllFields("John",11, 6000);

            objectOutputStream.writeObject(employee);
            EmployeeAllFields employeeAllFields2 = (EmployeeAllFields) inputStream.readObject();


            System.out.println((employeeAllFields2.getId() ==employee.getId()) + " Equal id");
            System.out.println((employeeAllFields2.getSalary() == employee.getSalary()) + " Equal salary");
            System.out.println((employeeAllFields2.getName().equals(employee.getName())) + " Equal names");
            System.out.println(employee.toString());
            System.out.println(employeeAllFields2.toString());


            EmployeeNoSalary employeeNoSalary = new EmployeeNoSalary(30000, "gHJK", 22);
            objectOutputStream.writeObject(employeeNoSalary);
            
            EmployeeNoSalary employeeNoSalary2 = (EmployeeNoSalary)inputStream.readObject();

            System.out.println(employeeNoSalary2.getId()== employeeNoSalary.getId());
            System.out.println(employeeNoSalary.getSalary()== employeeNoSalary2.getSalary());

            List<EmployeeAllFields> employeeAllFields = new ArrayList<>();
            employeeAllFields.add(new EmployeeAllFields("dggg", 23, 79));
            employeeAllFields.add(new EmployeeAllFields("dguio",555,900));

            objectOutputStream.writeObject(employeeAllFields);
            List<EmployeeAllFields> employeeTest = new ArrayList<>();
            employeeTest = (List<EmployeeAllFields>) inputStream.readObject();
            System.out.println(employeeTest.toString());
            System.out.println(employeeAllFields.toString());

        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
