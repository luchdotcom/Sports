package com.citb408_Spring2021;

public abstract class SportsClub {
    private final String name;
    private double peyRent;
    private double salary;


    protected SportsClub(String name, double peyRent, double salary) {
        this.name = name;
        this.peyRent = peyRent;
        this.salary = salary;
    }

    public double costs() {
        return peyRent + salary;
    }

    public abstract double income();

    public double profit() {
        return costs() - income();
    }

    public SportsClub biggerClub(SportsClub sportsClub) {
        return this.income() >sportsClub.income() ? this:sportsClub ;
    }

    @Override
    public String toString() {
        return "SportsClub{" +
                "name='" + name + '\'' +
                ", peyRent=" + peyRent +
                ", salary=" + salary +
                '}';
    }
}
