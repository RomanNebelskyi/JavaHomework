package Soft.hw19.task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Main
{
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
      System.out.println(convert(date));
       // System.out.println(date.getYear() + 1900);
        System.out.println(convertTime(date));
        System.out.println(convertDateTime(date));
    }

    static LocalDate convert(Date date)
    {
        String [] parse  =date.toString().split(" ");

        LocalDate localDate = LocalDate.of(date.getYear() + 1900, date.getMonth()+1, Integer.parseInt(parse[2]));
        return localDate;
    }

    static LocalTime convertTime(Date date)
    {
        LocalTime localTime = LocalTime.of(date.getHours(), date.getMinutes(), date.getSeconds());
        return localTime;
    }
    static LocalDateTime convertDateTime(Date date)
    {
        String [] parse  =date.toString().split(" ");
        LocalDateTime localTime = LocalDateTime.of(date.getYear()+ 1900 , date.getMonth()+1, Integer.parseInt(parse[2]),
                date.getHours(),date.getMinutes(), date.getSeconds());
        return localTime;
    }

}
