package oopeindopdracht;

import java.util.ArrayList;
//Nick Mallinckrodt OOP 3/3/2020
public class Klant {
    
    private double portomonee;
    
    public Klant (double portomonee){
        this.portomonee = portomonee;
        
    }

    public double getPortomonee() {
        return portomonee;
    }

    public void setPortomonee(double portomonee) {
        this.portomonee = portomonee;
    }
}
