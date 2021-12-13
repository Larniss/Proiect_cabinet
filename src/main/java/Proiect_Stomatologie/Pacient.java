package Proiect_Stomatologie;


public class Pacient {

	private String nume;
	private String prenume;
	private String telefon;
	private String email;
	private int varsta;
	private char sex;
	private String adresa;
	private String observatii;
	

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
		return "Pacient [nume=" + nume + ", prenume=" + prenume + ", telefon=" + telefon + ", email=" + email
				+ ", varsta=" + varsta + ", sex=" + sex + ", adresa=" + adresa + ", observatii=" + observatii + "]";
	}

}
