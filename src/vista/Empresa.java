package vista;

public class Empresa  {
	
	public String CIF;
	public String NOMBRE;
	public String CP;
	public String DIRECCION;
	public String PROVINCIA;
	public int TELEFONO;
	public String CIUDAD;
	public String ESPECIALIDAD;
	public String NIF_REPRE;
	
	public Empresa(String cIF, String nOMBRE, String cP, String dIRECCION, String pROVINCIA, int tELEFONO,
			String cIUDAD, String eSPECIALIDAD, String nIF_REPRE) {
		super();
		CIF = cIF;
		NOMBRE = nOMBRE;
		CP = cP;
		DIRECCION = dIRECCION;
		PROVINCIA = pROVINCIA;
		TELEFONO = tELEFONO;
		CIUDAD = cIUDAD;
		ESPECIALIDAD = eSPECIALIDAD;
		NIF_REPRE = nIF_REPRE;
	}
	
	public Empresa( String nOMBRE) {
		super();
		CIF = "";
		NOMBRE = nOMBRE;
		CP = "";
		DIRECCION = "";
		PROVINCIA = "";
		TELEFONO = 000000000;
		CIUDAD = "";
		ESPECIALIDAD = "";
		NIF_REPRE = "";
	}
	
	public Empresa() {
		super();
		CIF = "";
		NOMBRE = "";
		CP = "";
		DIRECCION = "";
		PROVINCIA = "";
		TELEFONO = 000000000;
		CIUDAD = "";
		ESPECIALIDAD = "";
		NIF_REPRE = "";
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public String getCP() {
		return CP;
	}

	public void setCP(String cP) {
		CP = cP;
	}

	public String getDIRECCION() {
		return DIRECCION;
	}

	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}

	public String getPROVINCIA() {
		return PROVINCIA;
	}

	public void setPROVINCIA(String pROVINCIA) {
		PROVINCIA = pROVINCIA;
	}

	public int getTELEFONO() {
		return TELEFONO;
	}

	public void setTELEFONO(int tELEFONO) {
		TELEFONO = tELEFONO;
	}

	public String getCIUDAD() {
		return CIUDAD;
	}

	public void setCIUDAD(String cIUDAD) {
		CIUDAD = cIUDAD;
	}

	public String getESPECIALIDAD() {
		return ESPECIALIDAD;
	}

	public void setESPECIALIDAD(String eSPECIALIDAD) {
		ESPECIALIDAD = eSPECIALIDAD;
	}

	public String getNIF_REPRE() {
		return NIF_REPRE;
	}

	public void setNIF_REPRE(String nIF_REPRE) {
		NIF_REPRE = nIF_REPRE;
	}
	
	
	
	

}
