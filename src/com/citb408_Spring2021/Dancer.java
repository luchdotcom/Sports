package com.citb408_Spring2021;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Dancer {
    private String name;
    private LocalDate registerDate;
    private Stile stile;
    private static long YearOfЕxperience;

    public Dancer(String name,LocalDate registerDate, Stile stile) {
        this.name = name;
        this.registerDate = registerDate;
        this.stile = stile;
    }

    public String getName() {
        return name;
    }

    public Stile getStile() {
        return stile;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public static long getYearOfЕxperience() {
        return YearOfЕxperience;
    }

    public static void setYearOfЕxperience(long YearOfЕxperience) {
        Dancer.YearOfЕxperience = YearOfЕxperience;
    }

    public static void incrementExperience(long num){
        if(num>0){
            Dancer.YearOfЕxperience+=num;
        }

    }

    public boolean isExpert(){
        return ChronoUnit.YEARS.between(this.registerDate,LocalDate.now()) >= YearOfЕxperience;
    }
    public Dancer isBiggerDancer(Dancer dancer ){
       return this.registerDate.isBefore(dancer.registerDate)?this:dancer;
    }
}
