package com.citb408_Spring2021;

import java.util.ArrayList;
import java.util.List;

public class DancingClub extends SportsClub {
    private double dancerPey;
    public List<Dancer> dancersList;

    public DancingClub(String name, double peyRent, double salary,double dancerPey) {
        super(name, peyRent, salary);
        this.dancerPey = dancerPey;
        this.dancersList = new ArrayList<>();
    }

    public void addDancer(Dancer dancer) {
        if (!this.dancersList.contains(dancer)) {
            this.dancersList.add(dancer);
        }

    }

    public double income() {
        return dancersList.size() * dancerPey;
    }

    public int getDancingNumber(Stile dancingStile) {
        int dancingNumber = 0;
        for (Dancer dancer : dancersList) {
            if (dancer.getStile() == dancingStile) {
                dancingNumber++;
            }
        }
        return dancingNumber;
    }

    public double incomeDancingStile(Stile stile) {
        return getDancingNumber(stile) * this.dancerPey;
    }
    public DancingClub biggesClub(DancingClub club){
        return this.profit()>club.profit()?this:club;
    }

    @Override
    public String toString() {
        return "DancingClub{" +
                "dancerPey=" + dancerPey +
                ", dancersList=" + dancersList +
                "} " + super.toString();
    }
}
