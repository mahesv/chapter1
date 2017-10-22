package com.sample;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
//import java.time.temporal.ChronoField;

import static java.time.temporal.ChronoField.*;

public class Timeop {
    public static void main(String args[])
    {
        Instant s=Instant.now();
        int a=5;
        int b=6;
        int c=a+b;
        Instant end=Instant.now();
        System.out.println(Duration.between(s,end).toMillis());
        LocalDate today=LocalDate.now();
        System.out.println(today);
        LocalDate mybday=LocalDate.of(1998,03,03);
        System.out.println(mybday);
    }
}
