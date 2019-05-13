package vista;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class VentanaModificar {
	
	@FXML
	private Button Siguiente;
	
	@FXML
	private ChoiceBox<String> Desple;

	
	public void Siguiete(ActionEvent event) throws IOException{	
	    
		if(Desple.getSelectionModel().getSelectedItem().equals("Alumnos")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("ModAlumno.fxml"));
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
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("ModTutorEmp.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
		}else if(Desple.getSelectionModel().getSelectedItem().equals("Empresa")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("ModEmpresa.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
		}else if(Desple.getSelectionModel().getSelectedItem().equals("Ciclo")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("ModCiclo.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
		}else if(Desple.getSelectionModel().getSelectedItem().equals("Representante empresa")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("ModRepresentanteEmp.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
		}else if(Desple.getSelectionModel().getSelectedItem().equals("Centro")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("ModCentro.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
		}else if(Desple.getSelectionModel().getSelectedItem().equals("Practicas")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("ModPracticas.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
		}else if(Desple.getSelectionModel().getSelectedItem().equals("Convenio")) {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("ModConvenio.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Venta Dos");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
			
		}
	}
		
		public void initialize(){

			 Desple = new ChoiceBox<String>();
			 Desple.getItems().addAll("Alumnos", "Tutores de centro", "Tutores de empresa","Empresa","Ciclo","Representante Empresa","Centro","Practicas","Convenios");
			
		}

}
