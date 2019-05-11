package com.es2.tdd;

public class Euro {
    //double euro;
    int euro;
    private static final double CENTS_PER_EURO = 100;
/*
    public Euro(double e) {
        this.euro = e;
    }
*/

    public Euro(int e) {
        this.euro = e;
    }
    public String toString(){
        // return String.format("EUR %.2f", this.euro);
        return String.format("EUR %.2f", (double) this.euro/CENTS_PER_EURO);
    }

    @Override
    public boolean equals(Object e2){
        return (e2 instanceof Euro) && this.euro == ((Euro) e2).euro;
    }

/*    public Euro minus(Double oneEuro) {
        return new Euro(this.euro-oneEuro);
    }*/

    public Euro minus(int oneEuro) {
        return new Euro(this.euro-oneEuro);
    }
}