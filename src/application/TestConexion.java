package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import vista.Alumnos;
import vista.Ciclos;
import vista.Empresa;
import vista.Tutor_Empresa;
import vista.Tutores;

public class TestConexion {
	
	
	
	

	private String bd;
	private String url= "jdbc:oracle:thin:@localhost:1521:XE";
	private String usr = "";
	private String pwd = "";
	private String scheme = "";
	private static Connection conexion;

	public TestConexion()  {		
		
				Properties propiedades = new Properties();
				InputStream entrada = null;
				try {
					File miFichero = new File("src/application/hola.ini");
					if(miFichero.exists()) {
						System.out.println("Fichero encontrado");
					entrada = new FileInputStream(miFichero);
					propiedades.load(entrada);
					System.out.println(propiedades.getProperty("Basededatos"));
					usr=propiedades.getProperty("usr");
					System.out.println(usr);
					pwd=propiedades.getProperty("pwd");
					scheme=propiedades.getProperty("scheme");
					}else
						System.err.println("Fichero no encontraro");
				}catch (IOException ex) {
					ex.printStackTrace();
				}finally {
					if (entrada !=null ) {
						try {
							entrada.close();
						}catch(IOException e) {
							e.printStackTrace();
						}
					}
				}
			
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection(url, usr, pwd);
			
			if(!conexion.isClosed()) {
				System.out.println("Conexión establecida");
				//conexion.close();
			}
			else
				System.out.println("Fallo en Conexión");	
			

		}catch (Exception e) {
			System.out.println("ERROR en conexión con ORACLE");	
			e.printStackTrace();
		}
		
	}
	
		public ObservableList<Empresa> ConsultaNombEmp() {
				
				final ObservableList<Empresa> dataEmp = FXCollections.observableArrayList();
				
				
				
				
				try {
					Statement stmt = conexion.createStatement();
					ResultSet rset = stmt.executeQuery("SELECT * FROM PRUEBA.EMPRESAS" );
					while(rset.next()) {
						dataEmp.add(new Empresa(rset.getString(2)));
						
						
					}
					rset.close();
					stmt.close();
					
				}catch (SQLException s){
					s.printStackTrace();
				}
			
				return dataEmp;
				
				
			}
		public ObservableList<Alumnos> ConsultaAl() {
			
			
			final ObservableList<Alumnos> dataAl = FXCollections.observableArrayList();
			
			
			
			
			try {
				Statement stmt = conexion.createStatement();
				ResultSet rset = stmt.executeQuery("SELECT * FROM PRUEBA.ALUMNOS" );
				while(rset.next()) {
					dataAl.add(new Alumnos(rset.getString(3),rset.getString(2)));
					
					
				}
				rset.close();
				stmt.close();
				
			}catch (SQLException s){
				s.printStackTrace();
			}
			return dataAl;
			
			
		}
		public ObservableList<Ciclos> ConsultaCi() {
			
		
			final ObservableList<Ciclos> dataCi = FXCollections.observableArrayList();
			
			
			
			
			try {
				Statement stmt = conexion.createStatement();
				ResultSet rset = stmt.executeQuery("SELECT * FROM PRUEBA.CICLOS" );
				while(rset.next()) {
					dataCi.add(new Ciclos(rset.getString(2)));
					
					
				}
				rset.close();
				stmt.close();
				
			}catch (SQLException s){
				s.printStackTrace();
			}
			return dataCi;
			
			
		}
		public ObservableList<Tutores> ConsultaTutores() {
			
			
			final ObservableList<Tutores> dataTut = FXCollections.observableArrayList();
			
			
			
			
			try {
				Statement stmt = conexion.createStatement();
				ResultSet rset = stmt.executeQuery("SELECT * FROM PRUEBA.TUTORES" );
				while(rset.next()) {
					dataTut.add(new Tutores(rset.getString(3),rset.getString(2)));
					
					
				}
				rset.close();
				stmt.close();
				
			}catch (SQLException s){
				s.printStackTrace();
			}
			return dataTut;
			
			
		}
		public ObservableList<Tutor_Empresa> ConsultaTutEmp() {
			
			
			final ObservableList<Tutor_Empresa> dataTutEmp = FXCollections.observableArrayList();
			
			
			
			try {
				Statement stmt = conexion.createStatement();
				ResultSet rset = stmt.executeQuery("SELECT * FROM PRUEBA.TUTOR_EMPRESA" );
				while(rset.next()) {
					dataTutEmp.add(new Tutor_Empresa(rset.getString(3),rset.getString(2)));
					
					
				}
				rset.close();
				stmt.close();
				
			}catch (SQLException s){
				s.printStackTrace();
			}
			return dataTutEmp;
			
			
		}
		
		
			
	
		
	
	
	


}
