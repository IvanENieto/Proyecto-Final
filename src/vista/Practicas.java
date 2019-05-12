package vista;

public class Practicas {
	
	public String NIF;
	public String CIF;
	public String INICIO;
	public String FIN;
	public String HORARIO;
	public String HORAS_DIAS;
	
	public Practicas(String nIF, String cIF, String iNICIO, String fIN, String hORARIO, String hORAS_DIAS) {
		super();
		NIF = nIF;
		CIF = cIF;
		INICIO = iNICIO;
		FIN = fIN;
		HORARIO = hORARIO;
		HORAS_DIAS = hORAS_DIAS;
	}
	
	public Practicas() {
		super();
		NIF = "";
		CIF = "";
		INICIO = "";
		FIN = "";
		HORARIO = "";
		HORAS_DIAS = "";
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getCIF() {
		return CIF;
	}

	public void setCIF(String cIF) {
		CIF = cIF;
	}

	public String getINICIO() {
		return INICIO;
	}

	public void setINICIO(String iNICIO) {
		INICIO = iNICIO;
	}

	public String getFIN() {
		return FIN;
	}

	public void setFIN(String fIN) {
		FIN = fIN;
	}

	public String getHORARIO() {
		return HORARIO;
	}

	public void setHORARIO(String hORARIO) {
		HORARIO = hORARIO;
	}

	public String getHORAS_DIAS() {
		return HORAS_DIAS;
	}

	public void setHORAS_DIAS(String hORAS_DIAS) {
		HORAS_DIAS = hORAS_DIAS;
	}
	
	

}
