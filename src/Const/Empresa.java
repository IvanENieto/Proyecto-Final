package Const;

public class Empresa extends vista.VentanaPrincipal {
	
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
	
	
	

}
