package vista;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
	
	ObservableList<String> DepartamentoList = FXCollections.observableArrayList("");
		
		@FXML
		private TableView<Empresa> Empresas;		
		@FXML
		private TableView<Alumnos> Alumnos;
		@FXML
		private TableView<Ciclos> Ciclos;
		@FXML
		private TableView<Tutores> Tutores;
		@FXML
		private TableView<Tutemp> Tutemp;
	
		@FXML
		private TableColumn<Empleado,String> ColNombre;
	
	
	
	public void initialize(){
		
		conexionbbdd = new TestConexion();
		
		
	}
	
}