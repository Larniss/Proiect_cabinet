package Proiect_Stomatologie;

public class FisaPacient extends Pacient {

	private int numarFisa;
	private String dataNasterii;
	private String profesie;
	private String antecedenteHereto_Colaterale;
	private String antecedentePersoanale;
	private String alergii;
	private String tratamenteUrmate;
	private String examenDento_Parodontal;
	private String examenMucoasaBucala;
	private String diagnostic;
	private String planTratament;
	
	
	public int getNumarFisa() {
		return numarFisa;
	}

	public void setNumarFisa(int numarFisa) {
		this.numarFisa = numarFisa;
	}

	public String getDataNasterii() {
		return dataNasterii;
	}

	public void setDataNasterii(String dataNasterii) {
		this.dataNasterii = dataNasterii;
	}

	public String getProfesie() {
		return profesie;
	}

	public void setProfesie(String profesie) {
		this.profesie = profesie;
	}

	public String getAntecedenteHereto_Colaterale() {
		return antecedenteHereto_Colaterale;
	}

	public void setAntecedenteHereto_Colaterale(String antecedenteHeredo_Colaterale) {
		this.antecedenteHereto_Colaterale = antecedenteHeredo_Colaterale;
	}

	public String getAntecedentePersoanale() {
		return antecedentePersoanale;
	}

	public void setAntecedentePersoanale(String antecedentePersoanale) {
		this.antecedentePersoanale = antecedentePersoanale;
	}

	public String getAlergii() {
		return alergii;
	}

	public void setAlergii(String alergii) {
		this.alergii = alergii;
	}

	public String getTratamenteUrmate() {
		return tratamenteUrmate;
	}

	public void setTratamenteUrmate(String tratamenteUrmate) {
		this.tratamenteUrmate = tratamenteUrmate;
	}

	public String getExamenDento_Parodontal() {
		return examenDento_Parodontal;
	}

	public void setExamenDento_Parodontal(String examenDento_Parodontal) {
		this.examenDento_Parodontal = examenDento_Parodontal;
	}

	public String getExamenMucoasaBucala() {
		return examenMucoasaBucala;
	}

	public void setExamenMucoasaBucala(String examenMucoasaBucala) {
		this.examenMucoasaBucala = examenMucoasaBucala;
	}

	public String getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	public String getPlanTratament() {
		return planTratament;
	}

	public void setPlanTratament(String planTratament) {
		this.planTratament = planTratament;
	}
	
	@Override
	public String toString() {
		return "FisaPacient [numarFisa=" + numarFisa + ", dataNasterii=" + dataNasterii + ", profesie=" + profesie
				+ ", antecedenteHeredo_Colaterale=" + antecedenteHereto_Colaterale + ", antecedentePersoanale="
				+ antecedentePersoanale + ", alergii=" + alergii + ", tratamenteUrmate=" + tratamenteUrmate
				+ ", examenDento_Parodontal=" + examenDento_Parodontal + ", examenMucoasaBucala=" + examenMucoasaBucala
				+ ", diagnostic=" + diagnostic + ", planTratament=" + planTratament + "]";
	}
	
}
