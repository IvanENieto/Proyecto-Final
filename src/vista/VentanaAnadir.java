package vista;

import java.io.IOException;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class VentanaAnadir {
	
	
	@FXML
	private Button Siguiente;
	
	@FXML
	private ChoiceBox<String> Desple;
	
	ObservableList<String> DespleList = FXCollections.observableArrayList("Alumnos", "Tutores de centro", "Tutores de empresa","Empresa","Ciclo","Representante Empresa");
	
	
	
	
	

	public void Siguiete(ActionEvent event) throws IOException{	
    
		if(Desple.getSelectionModel().getSelectedItem().equals("Alumnos")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("AnadirAlumno.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
		}else if(Desple.getSelectionModel().getSelectedItem().equals("Tutores de centro")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("AnadirTutor.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
			
		}else if(Desple.getSelectionModel().getSelectedItem().equals("Tutores de empresa")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("AnadirTutorEmp.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
		}else if(Desple.getSelectionModel().getSelectedItem().equals("Empresa")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("AnadirEmpresa.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
		}else if(Desple.getSelectionModel().getSelectedItem().equals("Ciclo")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("AnadirCiclo.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
		}else if(Desple.getSelectionModel().getSelectedItem().equals("Representante empresa")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("AnadirRepresentanteEmp.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
		}
		
		
	
	}
	

	public void initialize(){
		
		

	
		 Desple.setItems(DespleList);
		
		
	}
	
	

}
