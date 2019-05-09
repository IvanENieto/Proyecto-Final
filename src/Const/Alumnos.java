package Const;

public class Alumnos extends vista.VentanaPrincipal {
	public String NIF;
	public String NOMBRE;
	public String APELLIDOS;
	public String DIRECCION;
	public String FECHA_NACIMIENTO;
	public String EMAIL;
	public String NIF_TUTO;
	public String NIF_TUTO_EMP;
	
	public Alumnos(String nIF, String nOMBRE, String aPELLIDOS, String dIRECCION, String fECHA_NACIMIENTO, String eMAIL,
			String nIF_TUTO, String nIF_TUTO_EMP) {
		super();
		NIF = nIF;
		NOMBRE = nOMBRE;
		APELLIDOS = aPELLIDOS;
		DIRECCION = dIRECCION;
		FECHA_NACIMIENTO = fECHA_NACIMIENTO;
		EMAIL = eMAIL;
		NIF_TUTO = nIF_TUTO;
		NIF_TUTO_EMP = nIF_TUTO_EMP;
	}
	
	public Alumnos( String nOMBRE, String aPELLIDOS) {
		super();
		NIF = "";
		NOMBRE = nOMBRE;
		APELLIDOS = "";
		DIRECCION = "";
		FECHA_NACIMIENTO = "";
		EMAIL = "";
		NIF_TUTO = "";
		NIF_TUTO_EMP = "";
	}
	
	public Alumnos() {
		super();
		NIF = "";
		NOMBRE = "";
		APELLIDOS = "";
		DIRECCION = "";
		FECHA_NACIMIENTO = "";
		EMAIL = "";
		NIF_TUTO = "";
		NIF_TUTO_EMP = "";
	}
	

}
