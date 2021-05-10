package com.citb408_Spring2021;
import org.xml.sax.SAXNotSupportedException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Dancer dancer = new Dancer("Ivanov", LocalDate.of(1987, 12, 3), Stile.BALLET);
        Dancer dancer1 = new Dancer("Poly", LocalDate.of(1983, 12, 5), Stile.BALLET);
        Dancer dancer2 = new Dancer("Moly", LocalDate.of(1967, 12, 2), Stile.BALLET);
        Dancer dancer3 = new Dancer("Mona", LocalDate.of(1997, 12, 1), Stile.BALLET);
        Dancer dancer4 = new Dancer("Kona", LocalDate.of(1977, 12, 24), Stile.BALLET);

        Dancer.setYearOfЕxperience(2);
        System.out.println(Dancer.getYearOfЕxperience());
        Dancer.incrementExperience(1);
        System.out.println(Dancer.getYearOfЕxperience());

        System.out.println("Is " + dancer + " experienced " + dancer.isExpert());
        System.out.println("Who is more experienced? " + dancer.isBiggerDancer(dancer1));
        SportsClub sportsClub1 = new DancingClub("Dancing Club 1", 3000, 6000, 100);
        System.out.println("The costs of " + sportsClub1 + " is " + sportsClub1.costs());

    }
}
