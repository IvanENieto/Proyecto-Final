package vista;

public class Ciclos {
	
	public String CODIGO;
	public String NOMBRE;
	public String DURACIO_PRACT;
	public String CURSO;
	public String FAMILIA_PROF;
	public String COD_FP;
	public String CAPACIDADES;
	public String Actividades;
	public String CRITERIOS;
	
	public Ciclos(String cODIGO, String nOMBRE, String dURACIO_PRACT, String cURSO, String fAMILIA_PROF, String cOD_FP,
			String cAPACIDADES, String actividades, String cRITERIOS) {
		super();
		CODIGO = cODIGO;
		NOMBRE = nOMBRE;
		DURACIO_PRACT = dURACIO_PRACT;
		CURSO = cURSO;
		FAMILIA_PROF = fAMILIA_PROF;
		COD_FP = cOD_FP;
		CAPACIDADES = cAPACIDADES;
		Actividades = actividades;
		CRITERIOS = cRITERIOS;
	}
	
	public Ciclos() {
		super();
		CODIGO = "";
		NOMBRE = "";
		DURACIO_PRACT = "";
		CURSO = "";
		FAMILIA_PROF = "";
		COD_FP = "";
		CAPACIDADES = "";
		Actividades = "";
		CRITERIOS = "";
	}
	
	public Ciclos( String nOMBRE) {
		super();
		CODIGO = "";
		NOMBRE = nOMBRE;
		DURACIO_PRACT = "";
		CURSO = "";
		FAMILIA_PROF = "";
		COD_FP = "";
		CAPACIDADES = "";
		Actividades = "";
		CRITERIOS = "";
	}

	public String getCODIGO() {
		return CODIGO;
	}

	public void setCODIGO(String cODIGO) {
		CODIGO = cODIGO;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public String getDURACIO_PRACT() {
		return DURACIO_PRACT;
	}

	public void setDURACIO_PRACT(String dURACIO_PRACT) {
		DURACIO_PRACT = dURACIO_PRACT;
	}

	public String getCURSO() {
		return CURSO;
	}

	public void setCURSO(String cURSO) {
		CURSO = cURSO;
	}

	public String getFAMILIA_PROF() {
		return FAMILIA_PROF;
	}

	public void setFAMILIA_PROF(String fAMILIA_PROF) {
		FAMILIA_PROF = fAMILIA_PROF;
	}

	public String getCOD_FP() {
		return COD_FP;
	}

	public void setCOD_FP(String cOD_FP) {
		COD_FP = cOD_FP;
	}

	public String getCAPACIDADES() {
		return CAPACIDADES;
	}

	public void setCAPACIDADES(String cAPACIDADES) {
		CAPACIDADES = cAPACIDADES;
	}

	public String getActividades() {
		return Actividades;
	}

	public void setActividades(String actividades) {
		Actividades = actividades;
	}

	public String getCRITERIOS() {
		return CRITERIOS;
	}

	public void setCRITERIOS(String cRITERIOS) {
		CRITERIOS = cRITERIOS;
	}
	
	
	
	

}
