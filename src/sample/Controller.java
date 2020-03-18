package sample;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static java.lang.Integer.parseInt;

public class Controller {

    public TextField Unos;
    public TextArea izlaz;

    public int sumaCifara(int n){
        int suma = 0;
        while(n != 0){
            suma += (n%10);
            n/=10;
        }
        return suma;
    }

    public void ispis(ActionEvent actionEvent) {
        String temp = "";
        int n = parseInt(Unos.getText());
        for(int i = 1; i < n; i++){
            int suma = sumaCifara(i);
            if(i % suma == 0)
                temp+= i + " ";
        }
        izlaz.setText(temp);
    }
}
