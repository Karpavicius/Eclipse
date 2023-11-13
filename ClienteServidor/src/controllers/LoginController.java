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

public class LoginController implements Initializable {
	
	@FXML
	private Button iniciarConexao;
	
	@FXML
	private TextField ip, numeroPorta;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {		

		iniciarConexao.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					Parent parent = FXMLLoader.load(getClass().getResource("../interfaces/ClienteServidor.fxml"));	
					Scene scene = new Scene(parent);
					Stage stage = (Stage) ip.getScene().getWindow();
					stage.setScene(scene);
				} catch (IOException e) {
					
				}							
			}
		});
	}
}
