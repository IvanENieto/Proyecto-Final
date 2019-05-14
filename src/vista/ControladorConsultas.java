package vista;

import application.TestConexion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControladorConsultas {

		TestConexion conexionbbdd;
		
		@FXML
		private Tab Alumnos,TutoresCentro,Ciclo,RepresentanteCentro,Empresa,TutoresEmpresa,RepresentanteEmpresa,Convenios,Practicas;
		
		@FXML
		private TextField DNIAlumno,DNITutoresCentro,DNIRepresentanteCentro,DNITutoresEmpresa,DNIRepresentanteEmpresa,DNIPracitcas;
		
		@FXML
		private TextField ApellidoAlumno,ApellidoTutoresCentro,ApellidoRepresentanteCentro,ApellidoTutoresEmpresa,ApellidoRepresentanteEmpresa,ApellidoPracitcas;
		
		private  ObservableList<Alumnos> data = FXCollections.observableArrayList(
				new Alumnos("", ""));
			
			@FXML
			private TableView<Alumnos> TablaConsultas;	
			@FXML
			private TableColumn<Alumnos,String> ColNombreConsultas;
			@FXML
			private TableColumn<Alumnos,String> ColNombreConsultasApellido;

		public void initialize(){
			
			conexionbbdd = new TestConexion();
			
			data = conexionbbdd.ConsultaAl();
			TablaConsultas.setItems(data);
			ColNombreConsultas.setCellValueFactory(new PropertyValueFactory<Alumnos,String>("APELLIDOS"));
			ColNombreConsultasApellido.setCellValueFactory(new PropertyValueFactory<Alumnos,String>("NOMBRE"));
			/*Comentario*/
			
		}
		
		
}

