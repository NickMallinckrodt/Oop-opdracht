//Nick Mallinckrodt OOP 3/3/2020
package oopeindopdracht;

public class Kaas extends Product {
   
    public Kaas (String naam, double prijs, int aantal){
        super(naam, prijs, aantal);
    }
    
    @Override
    public String message(String message){
        message = "kaas toegevoegd!";
        System.out.println("kaas toegevoegd");
        return message;
    }
}
