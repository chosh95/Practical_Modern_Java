package com.company.ch08_date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate bDay = LocalDate.of(1995, Month.JUNE,8);
        LocalDate nextBDay = bDay.withYear(today.getYear());

        if(nextBDay.isAfter(today))
            System.out.println("올해의 생일이 아직 안 지났다.");
        if(nextBDay.isEqual(today))
            System.out.println("Today is Your BirthDay");

        System.out.println("이번달의 길이는 : " + today.lengthOfMonth());
        System.out.println("오늘부터 한 달 후는 : " + today.plusMonths(1));

        String format = today.plusDays(15).format(DateTimeFormatter.ofPattern("yy년 MM월 dd일"));
        System.out.println(format);

        Period period = Period.between(today,bDay);
        System.out.println(period);

    }
}
