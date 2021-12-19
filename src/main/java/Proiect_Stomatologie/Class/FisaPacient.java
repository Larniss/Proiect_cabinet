package Proiect_Stomatologie.Class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "fisapacient")
public class FisaPacient {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "dataNasterii")
	@JsonFormat(pattern="dd/MM/yyyy")
	private String dataNasterii;

	@Column(name = "profesie")
	private String profesie;

	@Column(name = "heretoColaterale")
	private String antecedenteHeredo_Colaterale;

	@Column(name = "personale")
	private String antecedentePersoanale;

	@Column(name = "alergii")
	private String alergii;

	@Column(name = "tratamenteUrmate")
	private String tratamenteUrmate;

	@Column(name = "dento_parodontal")
	private String examenDento_Parodontal;

	@Column(name = "mucoasa")
	private String examenMucoasaBucala;

	@Column(name = "diagnostic")
	private String diagnostic;

	@Column(name = "planTratament")
	private String planTratament;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getAntecedenteHeredo_Colaterale() {
		return antecedenteHeredo_Colaterale;
	}

	public void setAntecedenteHeredo_Colaterale(String antecedenteHeredo_Colaterale) {
		this.antecedenteHeredo_Colaterale = antecedenteHeredo_Colaterale;
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
		return "FisaPacient [id=" + id + ", dataNasterii=" + dataNasterii + ", profesie=" + profesie
				+ ", antecedenteHereto_Colaterale=" + antecedenteHeredo_Colaterale + ", antecedentePersoanale="
				+ antecedentePersoanale + ", alergii=" + alergii + ", tratamenteUrmate=" + tratamenteUrmate
				+ ", examenDento_Parodontal=" + examenDento_Parodontal + ", examenMucoasaBucala=" + examenMucoasaBucala
				+ ", diagnostic=" + diagnostic + ", planTratament=" + planTratament + "]";
	}

}
