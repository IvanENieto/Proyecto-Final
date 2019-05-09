package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
	
	
		
	
	
	


}
