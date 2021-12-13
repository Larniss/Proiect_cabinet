package Proiect_Stomatologie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pacient")
public class Pacient {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "nume")
	private String nume;

	@Column(name = "prenume")
	private String prenume;

	@Column(name = "telefon")
	private String telefon;

	@Column(name = "email")
	private String email;

	@Column(name = "varsta")
	private int varsta;

	@Column(name = "sex")
	private char sex;

	@Column(name = "adresa")
	private String adresa;

	@Column(name = "observatii")
	private String observatii;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getObservatii() {
		return observatii;
	}

	public void setObservatii(String observatii) {
		this.observatii = observatii;
	}

	@Override
	public String toString() {
		return "Pacient [id=" + id + ", nume=" + nume + ", prenume=" + prenume + ", telefon=" + telefon + ", email="
				+ email + ", varsta=" + varsta + ", sex=" + sex + ", adresa=" + adresa + ", observatii=" + observatii
				+ "]";
	}

}
