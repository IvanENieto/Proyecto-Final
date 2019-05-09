package vista;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import Const.Alumnos;
import Const.Empresa;
import application.TestConexion;

public class VentanaPrincipal  {
	
	TestConexion conexionbbdd;
	
	@FXML
	private Button Añadir;
	
	@FXML
	private Button Editar;
	
	@FXML
	private Button Enviar;
	
	@FXML
	private Button Consultar;
	
	@FXML
	private Button Borrar;
	
	private final ObservableList<Empresa> dataEmp = FXCollections.observableArrayList(
			new Empresa(""));
		
		@FXML
		private TableView<Empresa> TablaEmp;	
		@FXML
		private TableColumn<Empresa,String> ColNombreEmp;
		
	private final ObservableList<Alumnos> dataAl = FXCollections.observableArrayList(
			new Alumnos("", ""));
		
		@FXML
		private TableView<Alumnos> TablaAll;	
		@FXML
		private TableColumn<Alumnos,String> ColNombreAll;
		
	private final ObservableList<Ciclos> dataCi = FXCollections.observableArrayList(
			new Ciclos("", ""));
		
		@FXML
		private TableView<Ciclos> TablaCi;	
		@FXML
		private TableColumn<Ciclos,String> ColNombreCi;
		
	private final ObservableList<Tutores> dataTut = FXCollections.observableArrayList(
			new Tutores("", ""));
		
		@FXML
		private TableView<Tutores> TablaTut;	
		@FXML
		private TableColumn<Tutores,String> ColNombreTut;
		
	private final ObservableList<TutEmp> dataTutEmp = FXCollections.observableArrayList(
			new TutEmp("", ""));
		
		@FXML
		private TableView<TutEmp> TablaTuEmp;
	
		@FXML
		private TableColumn<Tutemp,String> ColNombrTuemp;
		
		
		
		
	
	
	
	
	public void initialize(){
		
		conexionbbdd = new TestConexion();
		
		
	}
	
}