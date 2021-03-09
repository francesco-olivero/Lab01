package it.polito.tdp.parole;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.parole.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole words = new Parole();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancel;

    @FXML
    void doInsert(ActionEvent event) {
    	String in = this.txtParola.getText();
    	this.txtParola.clear();
    	if (!in.isEmpty()) {
    		words.addParola(in);
    		this.txtResult.clear();
    		String out = "";
    		for (String s: words.getElenco()) {
    			out += s + "\n";
    		}
    		this.txtResult.setText(out);
    	}

    }

    @FXML
    void doReset(ActionEvent event) {
    	words.reset();
    	this.txtResult.clear();

    }
    
    @FXML
    void doCancel (ActionEvent event) {
    	String can = this.txtResult.getSelectedText();
    	words.cancel(can);
    	this.txtResult.clear();
		String out = "";
		for (String s: words.getElenco()) {
			out += s + "\n";
		}
		this.txtResult.setText(out);

    }
    
    

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'Scene.fxml'.";


    }
}


