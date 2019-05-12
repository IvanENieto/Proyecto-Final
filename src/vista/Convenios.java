package vista;

public class Convenios {
	
	public String NUM_CONVENIO;
	public String FECHA;
	public String CIUDAD;
	public String CIF_EMPRE;
	public String CIF_CENTRO;
	
	public Convenios(String nUM_CONVENIO, String fECHA, String cIUDAD, String cIF_EMPRE, String cIF_CENTRO) {
		super();
		NUM_CONVENIO = nUM_CONVENIO;
		FECHA = fECHA;
		CIUDAD = cIUDAD;
		CIF_EMPRE = cIF_EMPRE;
		CIF_CENTRO = cIF_CENTRO;
	}
	
	public Convenios() {
		super();
		NUM_CONVENIO = "";
		FECHA = "";
		CIUDAD = "";
		CIF_EMPRE = "";
		CIF_CENTRO = "";
	}

	public String getNUM_CONVENIO() {
		return NUM_CONVENIO;
	}

	public void setNUM_CONVENIO(String nUM_CONVENIO) {
		NUM_CONVENIO = nUM_CONVENIO;
	}

	public String getFECHA() {
		return FECHA;
	}

	public void setFECHA(String fECHA) {
		FECHA = fECHA;
	}

	public String getCIUDAD() {
		return CIUDAD;
	}

	public void setCIUDAD(String cIUDAD) {
		CIUDAD = cIUDAD;
	}

	public String getCIF_EMPRE() {
		return CIF_EMPRE;
	}

	public void setCIF_EMPRE(String cIF_EMPRE) {
		CIF_EMPRE = cIF_EMPRE;
	}

	public String getCIF_CENTRO() {
		return CIF_CENTRO;
	}

	public void setCIF_CENTRO(String cIF_CENTRO) {
		CIF_CENTRO = cIF_CENTRO;
	}
	
	
	
	

}
