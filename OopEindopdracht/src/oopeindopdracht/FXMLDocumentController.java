//Nick Mallinckrodt OOP 3/3/2020
package oopeindopdracht;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    private double totaalprijs;
    private double wallet;
    Melk melk = new Melk("melk", 2.5, 0);
    Kaas kaas = new Kaas("kaas", 2, 0);
    Wortel wortel = new Wortel("wortel", 1.5, 0);
    Appel appel = new Appel("appel", 1, 0);
    Klant klant = new Klant(50);
    @FXML
    private TextArea winkelmand;
    @FXML
    private TextField tfKaas;
    @FXML
    private Button btnMelk;
    @FXML
    private TextField tfMelk;
    @FXML
    private Button btnKaas;
    @FXML
    private TextField tfTotaalPrijs;
    @FXML
    private Label lbWallet;
    @FXML
    private Button btnWortel;
    @FXML
    private Button btnAppel;
    @FXML
    private TextField tfWortel;
    @FXML
    private TextField tfAppel;
    @FXML
    private Label lbToevoeging;
    @FXML
    private Button btnBetalen;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        wallet += klant.getPortomonee();
        lbWallet.setText("te besteden: " + Double.toString(wallet) + " euro");
    }

    //haald data van kaas op en geeft het weer wanneer er op de knop word gedrukt
    @FXML
    private void handleKaasButtonAction(ActionEvent event) {
        
        kaas.naamProduct.add(kaas.getNaam());
        kaas.prijsProduct.add(kaas.getPrijs());

        winkelmand.appendText(kaas.getNaam() + "    " + kaas.getPrijs() + " " + "euro" + "\n");
        totaalprijs += kaas.getPrijs();
        tfTotaalPrijs.setText(Double.toString(totaalprijs));
        lbToevoeging.setText(kaas.message(""));
        System.out.println(kaas.prijsProduct);
        System.out.println("totaal: " + totaalprijs);
    }

    //haald data van melk op en geeft het weer wanneer er op de knop word gedrukt
    @FXML
    private void handleMelkButtonAction(ActionEvent event) {

        melk.naamProduct.add(melk.getNaam());
        melk.prijsProduct.add(melk.getPrijs());
        winkelmand.appendText(melk.getNaam() + "    " + melk.getPrijs() + " " + "euro" + "\n");
        totaalprijs += melk.getPrijs();
        tfTotaalPrijs.setText(Double.toString(totaalprijs));
        lbToevoeging.setText(melk.message(""));
        System.out.println(melk.prijsProduct);
        System.out.println("totaal: " + totaalprijs);
    }
    
    //knop die er voor zorgt dat de totale prijs van de huidige portomonee word afgetrokken
    @FXML
    private void handleBetalenButtonAction(ActionEvent event) {
        wallet -= totaalprijs;
        lbWallet.setText("te besteden: " + Double.toString(wallet) + " euro");
        totaalprijs -= totaalprijs;
        //checked of de value in wallet kleiner dan 0 is zo ja word er een exception gegooid
        if (wallet < 0) {
            try {

                tfTotaalPrijs.setText(Double.toString(totaalprijs));
                throw new MyException();

            } catch (MyException ex) {
                lbWallet.setText("Dat is te duur!");

            }

        } else {
            winkelmand.setText("");
            lbToevoeging.setText("");
        }

    }
    
     //haald data van wortel op en geeft het weer wanneer er op de knop word gedrukt
    @FXML
    private void handleWortelButtonAction(ActionEvent event) {
        wortel.naamProduct.add(wortel.getNaam());
        wortel.prijsProduct.add(wortel.getPrijs());
        winkelmand.appendText(wortel.getNaam() + "    " + wortel.getPrijs() + " " + "euro" + "\n");
        totaalprijs += wortel.getPrijs();
        tfTotaalPrijs.setText(Double.toString(totaalprijs));
        lbToevoeging.setText(wortel.message(""));
        System.out.println(wortel.prijsProduct);
        System.out.println("totaal: " + totaalprijs);
    }
    
     //haald data van appel op en geeft het weer wanneer er op de knop word gedrukt
    @FXML
    private void handleAppelButtonAction(ActionEvent event) {
        appel.naamProduct.add(appel.getNaam());
        appel.prijsProduct.add(appel.getPrijs());
        winkelmand.appendText(appel.getNaam() + "    " + appel.getPrijs() + " " + "euro" + "\n");
        totaalprijs += appel.getPrijs();
        tfTotaalPrijs.setText(Double.toString(totaalprijs));
        lbToevoeging.setText(appel.message(""));
        System.out.println(appel.prijsProduct);
        System.out.println("totaal: " + totaalprijs);
    }

}
