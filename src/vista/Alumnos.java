package vista;

public class Alumnos {
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
		APELLIDOS = aPELLIDOS;
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

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public String getAPELLIDOS() {
		return APELLIDOS;
	}

	public void setAPELLIDOS(String aPELLIDOS) {
		APELLIDOS = aPELLIDOS;
	}

	public String getDIRECCION() {
		return DIRECCION;
	}

	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}

	public String getFECHA_NACIMIENTO() {
		return FECHA_NACIMIENTO;
	}

	public void setFECHA_NACIMIENTO(String fECHA_NACIMIENTO) {
		FECHA_NACIMIENTO = fECHA_NACIMIENTO;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getNIF_TUTO() {
		return NIF_TUTO;
	}

	public void setNIF_TUTO(String nIF_TUTO) {
		NIF_TUTO = nIF_TUTO;
	}

	public String getNIF_TUTO_EMP() {
		return NIF_TUTO_EMP;
	}

	public void setNIF_TUTO_EMP(String nIF_TUTO_EMP) {
		NIF_TUTO_EMP = nIF_TUTO_EMP;
	}
	
	
	

}
