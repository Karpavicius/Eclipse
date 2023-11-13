package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ServidorController implements Initializable {
	
	@FXML
	private Button iniciarJogo;
	
	@FXML
	private TextField objeto, dica;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		iniciarJogo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					Parent parent = FXMLLoader.load(getClass().getResource("../interfaces/ClienteServidor.fxml"));	
					Scene scene = new Scene(parent);
					Stage stage = (Stage) objeto.getScene().getWindow();
					stage.setScene(scene);
				} catch (IOException e) {

				}
				
			}
		});
		
	}
	
}
