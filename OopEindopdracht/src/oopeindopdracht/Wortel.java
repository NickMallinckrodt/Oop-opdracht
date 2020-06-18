//Nick Mallinckrodt OOP 3/3/2020
package oopeindopdracht;

public class Wortel extends Product{
    
    public Wortel (String naam, double prijs, int aantal){
        super(naam, prijs, aantal);
    }
    
    @Override
    public String message(String message){
        message = "Wortel toegevoegd!";
        System.out.println("Wortel toegevoegd");
        return message;
    }
}
