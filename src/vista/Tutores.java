package vista;

public class Tutores {
	
	public String NIF;
	public String NOMBRE;
	public String APELLIDOS;
	public String DIRECCION;
	public String FECHA_NACIMIENTO;
	public String CODIGO;
	
	
	public Tutores(String nIF, String nOMBRE, String aPELLIDOS, String dIRECCION, String fECHA_NACIMIENTO,
			String cODIGO) {
		super();
		NIF = nIF;
		NOMBRE = nOMBRE;
		APELLIDOS = aPELLIDOS;
		DIRECCION = dIRECCION;
		FECHA_NACIMIENTO = fECHA_NACIMIENTO;
		CODIGO = cODIGO;
	}
	
	public Tutores() {
		super();
		NIF = "";
		NOMBRE = "";
		APELLIDOS = "";
		DIRECCION = "";
		FECHA_NACIMIENTO = "";
		CODIGO = "";
	}
	
	public Tutores(String nOMBRE,String aPELLIDOS) {
		super();
		NIF = "";
		NOMBRE = nOMBRE;
		APELLIDOS = aPELLIDOS;
		DIRECCION = "";
		FECHA_NACIMIENTO = "";
		CODIGO = "";
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

	public String getCODIGO() {
		return CODIGO;
	}

	public void setCODIGO(String cODIGO) {
		CODIGO = cODIGO;
	}
	
	
	

}
