package Soft.hw19.task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    static LocalTime convertTime(Date date)
    {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }
    static LocalDateTime convertDateTime(Date date)
    {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

}
