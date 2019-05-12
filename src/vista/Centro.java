package vista;

public class Centro {
	public String CIF ;
	public String DIRECCION;
	public String COD_CENTRO;
	public String PROVINVCIA;
	public int TELEFONO;
	public int CP;
	public String DAT;
	public String NOMBRE;
	public String NIF_REPRE;
	
	public Centro(String cIF, String dIRECCION, String cOD_CENTRO, String pROVINVCIA, int tELEFONO, int cP, String dAT,
			String nOMBRE, String nIF_REPRE) {
		super();
		CIF = cIF;
		DIRECCION = dIRECCION;
		COD_CENTRO = cOD_CENTRO;
		PROVINVCIA = pROVINVCIA;
		TELEFONO = tELEFONO;
		CP = cP;
		DAT = dAT;
		NOMBRE = nOMBRE;
		NIF_REPRE = nIF_REPRE;
	}
	
	public Centro() {
		super();
		CIF = "";
		DIRECCION = "";
		COD_CENTRO = "";
		PROVINVCIA = "";
		TELEFONO = 000000000;
		CP = 00000;
		DAT = "";
		NOMBRE = "";
		NIF_REPRE= "";
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getDIRECCION() {
		return DIRECCION;
	}

	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}

	public String getCOD_CENTRO() {
		return COD_CENTRO;
	}

	public void setCOD_CENTRO(String cOD_CENTRO) {
		COD_CENTRO = cOD_CENTRO;
	}

	public String getPROVINVCIA() {
		return PROVINVCIA;
	}

	public void setPROVINVCIA(String pROVINVCIA) {
		PROVINVCIA = pROVINVCIA;
	}

	public int getTELEFONO() {
		return TELEFONO;
	}

	public void setTELEFONO(int tELEFONO) {
		TELEFONO = tELEFONO;
	}

	public int getCP() {
		return CP;
	}

	public void setCP(int cP) {
		CP = cP;
	}

	public String getDAT() {
		return DAT;
	}

	public void setDAT(String dAT) {
		DAT = dAT;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public String getNIF_REPRE() {
		return NIF_REPRE;
	}

	public void setNIF_REPRE(String nIF_REPRE) {
		NIF_REPRE = nIF_REPRE;
	}
	
	
	
	
	
	

}
