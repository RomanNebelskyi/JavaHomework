package Soft.hw19.task1;

import java.lang.reflect.Field;

public class Main
{

    public static void main(String[] args) {

        Class<TestClass> testClass = TestClass.class;
        Field [] fields  = testClass.getDeclaredFields();
        for (Field f:
             fields) {
            if(f.isAnnotationPresent(MyAnnotation.class))
            {
                System.out.println(f.getName());
            }
        }

    }
}
