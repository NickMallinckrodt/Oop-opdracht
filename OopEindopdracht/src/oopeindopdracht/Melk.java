//Nick Mallinckrodt OOP 3/3/2020
package oopeindopdracht;

public class Melk extends Product{
    
    public Melk (String naam, double prijs, int aantal){
        super(naam, prijs, aantal);
    }
    
    @Override
    public String message(String message){
        message = "melk toegevoegd!";
        System.out.println("Melk toegevoegd!");
        return message;
    }
}
