//Nick Mallinckrodt OOP 3/3/2020
package oopeindopdracht;

public class Appel extends Product{
    
    public Appel (String naam, double prijs, int aantal){
        super(naam, prijs, aantal);
    }
    
    @Override
    public String message(String message){
        message = "Appel toegevoegd!";
        System.out.println("Appel toegevoegd");
        return message;
    }
}
