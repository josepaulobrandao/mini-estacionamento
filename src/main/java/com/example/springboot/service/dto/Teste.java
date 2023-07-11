package com.example.springboot.service.dto;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.text.DateFormat.*;

public class Teste {

    private static final double TAX = 2;
    private  static final double TAX_UNIQUE = 3.00;
    public static void main(String[] args) {

        System.out.println("--------------CALENDAR-----------------------");

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getFirstDayOfWeek())/*primeiro dia da semana*/;
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.get(1));
        System.out.println(calendar.get(2));
        System.out.println(calendar.getDisplayName(1,1, Locale.US));
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTime().after(new Date()));
        System.out.println(calendar.getMinimum(1));
        System.out.println(calendar.getTimeInMillis());
        System.out.println(calendar.getTimeZone());
        System.out.println(calendar.toInstant());
        //System.out.println(calendar.setTimeZone(TimeZone.getTimeZone()));
        System.out.println(calendar.getWeeksInWeekYear());
        System.out.println(calendar.getWeekYear());

        System.out.println("-------------------------------------");
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.toInstant());
        System.out.println("-------------------------------------");
        Temporal temporal = date.toInstant();
        System.out.println("temporal" + calendar.getTime());
        /*LocalDateTime.now().minus(temporal.minus(1));*/
        System.out.println("-------------------------------------");
        System.out.println("FormatStyle.MEDIUM: " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("FormatStyle.LONG:   " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FormatStyle.FULL:   " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("FormatStyle.SHORT:  " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

        DateFormat dateFormat = getDateInstance();
        System.out.println("DateTimeFormatter:  " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/mm/YYYY HH:mm:ss")));


        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_TIME));
       // System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_WEEK_DATE));
       // System.out.println(LocalDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));


        int x = 10;
        System.out.println(calculateVacancyParcking(x));

    }

    public static int calculateVacancyParcking(int x) {
        LocalTime horaAtual = LocalTime.now();
        int horas = horaAtual.getHour();
        System.out.println("A hora atual é: " + horas);
        return horas;
    }

    public static int calculateTax(Integer x){
        LocalTime horaAtual = LocalTime.now();
        int horas = horaAtual.getHour();
        if(horas == 6) {
            double taxUnique = TAX_UNIQUE;
        }else {
            for (int i = 0; i < horas; i++){
                i+=TAX;
            }
        }
		return horas;

    }
}
