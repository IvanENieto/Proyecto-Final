package vista;

import java.io.IOException;
import java.sql.SQLException;

import application.Main;
import application.TestConexion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PrincipalAñadir {	
	
	@FXML
	private Button Cerrar;
	
	@FXML
	private Button Siguiente;
	
	@FXML
	private ChoiceBox<String> Desple;
	
	public void Cerrar() throws SQLException {
			
		
	}

	public void Siguiete(ActionEvent event) throws IOException{	
    
	
	}
	

	public void initialize(){

		 Desple = new ChoiceBox<String>();
		 Desple.getItems().addAll("Alumnos", "Tutores de centro", "Tutores de empresa","Centro","Empresa","Ciclo","Representante Centro","Representante Empresa");
		
	}
	
		
	
	

}
