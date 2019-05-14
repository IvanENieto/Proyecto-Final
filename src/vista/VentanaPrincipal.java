package vista;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

import application.Main;
import application.TestConexion;

public class VentanaPrincipal  {
	
	TestConexion conexionbbdd;
	
	@FXML
	private Button Anadir;
	
	@FXML
	private Button Editar;
	
	@FXML
	private Button Enviar;
	
	@FXML
	private Button Consultar;
	
	@FXML
	private Button Borrar;
	
	private ObservableList<Empresa> dataEmp = FXCollections.observableArrayList(
			new Empresa(""));
		
		@FXML
		private TableView<Empresa> TablaEmp;	
		@FXML
		private TableColumn<Empresa,String> ColNombreEmp;
		
	private  ObservableList<Alumnos> dataAl = FXCollections.observableArrayList(
			new Alumnos("", ""));
		
		@FXML
		private TableView<Alumnos> TablaAll;	
		@FXML
		private TableColumn<Alumnos,String> ColNombreAll;
		@FXML
		private TableColumn<Alumnos,String> ColNombreAllNombre;
		
	private  ObservableList<Ciclos> dataCi = FXCollections.observableArrayList(
			new Ciclos(""));
		
		@FXML
		private TableView<Ciclos> TablaCi;	
		@FXML
		private TableColumn<Ciclos,String> ColNombreCi;
		
	private ObservableList<Tutores> dataTut = FXCollections.observableArrayList(
			new Tutores("", ""));
		
		@FXML
		private TableView<Tutores> TablaTut;	
		@FXML
		private TableColumn<Tutores,String> ColNombreTut;
		@FXML
		private TableColumn<Tutores,String> ColNombreTutNombre;
		
	private  ObservableList<Tutor_Empresa> dataTutEmp = FXCollections.observableArrayList(
			new Tutor_Empresa("",""));
		
		@FXML
		private TableView<Tutor_Empresa> TablaTuEmp;
	
		@FXML
		private TableColumn<Tutor_Empresa,String> ColNombrTuemp;
		@FXML
		private TableColumn<Tutor_Empresa,String> ColNombrTuempNombre;
		
		public void botonanadir(ActionEvent event) throws IOException{

			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../vista/VentanaAnadir.fxml"));
			AnchorPane ventanaDos = (AnchorPane) loader.load();
	        Stage ventana = new Stage();
	        ventana.setTitle("Ventana añadir");
	        ventana.setTitle("Añadir");
	        Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
		}
		
		public void botonconsultas(ActionEvent event) throws IOException{
			
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../vista/Consultas.fxml"));
	    TabPane ventanaTres = (TabPane) loader.load();
	    Stage ventana = new Stage();
	    ventana.setTitle("Consultas");
	    Scene scene = new Scene(ventanaTres);
	    ventana.setScene(scene);
	    ventana.show();
	    
		}
		
		/*Comentario*/
	
	
	
	
	public void initialize(){
		
		conexionbbdd = new TestConexion();
		
		dataEmp = conexionbbdd.ConsultaNombEmp();
		TablaEmp.setItems(dataEmp);
		ColNombreEmp.setCellValueFactory(new PropertyValueFactory<Empresa,String>("NOMBRE"));
		
		
		dataAl = conexionbbdd.ConsultaAl();
		TablaAll.setItems(dataAl);
		ColNombreAll.setCellValueFactory(new PropertyValueFactory<Alumnos,String>("APELLIDOS"));
		ColNombreAllNombre.setCellValueFactory(new PropertyValueFactory<Alumnos,String>("NOMBRE"));
		
		dataCi = conexionbbdd.ConsultaCi();
		TablaCi.setItems(dataCi);
		ColNombreCi.setCellValueFactory(new PropertyValueFactory<Ciclos,String>("NOMBRE"));
		
		dataTutEmp = conexionbbdd.ConsultaTutEmp();
		TablaTuEmp.setItems(dataTutEmp);
		ColNombrTuemp.setCellValueFactory(new PropertyValueFactory<Tutor_Empresa,String>("APELLIDOS"));
		ColNombrTuempNombre.setCellValueFactory(new PropertyValueFactory<Tutor_Empresa,String>("NOMBRE"));
		
		dataTut = conexionbbdd.ConsultaTutores();
		TablaTut.setItems(dataTut);
		ColNombreTut.setCellValueFactory(new PropertyValueFactory<Tutores,String>("APELLIDOS"));
		ColNombreTutNombre.setCellValueFactory(new PropertyValueFactory<Tutores,String>("NOMBRE"));
		
		
		
	}
	
}