//Nick Mallinckrodt OOP 3/3/2020
package oopeindopdracht;

public class Product extends Assortiment {

    public Product(String naam, double prijs, int aantal) {
        this.naam = naam;
        this.prijs = prijs;
        this.aantal = aantal;
        
    }

    public Product() {

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }
    public String message (String message){
        message = "product toegevoegd";
        System.out.println("product toegevoegd");
        return message;
    }
}
