package vista;

import java.util.Date;

public class Repre_Empresas {
	
	public String NIF;
	public String NOMBRE;
	public String APELLIDOS;
	public String DIRECCION;
	public String FECHA_NACIMIENTO;
	public String EMAIL;
	
	public Repre_Empresas(String nIF, String nOMBRE, String aPELLIDOS, String dIRECCION, String fECHA_NACIMIENTO,
			String eMAIL) {
		
		NIF = nIF;
		NOMBRE = nOMBRE;
		APELLIDOS = aPELLIDOS;
		DIRECCION = dIRECCION;
		FECHA_NACIMIENTO = fECHA_NACIMIENTO;
		EMAIL = eMAIL;
	}

	public Repre_Empresas() {
		super();
		
		NIF = "";
		NOMBRE = "";
		APELLIDOS = "";
		DIRECCION = "";
		FECHA_NACIMIENTO = "";
		EMAIL = "";
		
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
	
	
	
	
	
	
	

}
