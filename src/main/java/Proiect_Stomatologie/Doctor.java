package Proiect_Stomatologie;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "doctor")
public class Doctor {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "nume")
	private String nume;
	
	@Column(name = "prenume")
	private String prenume;
	
	@Column(name = "telefon")
	private String telefon;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	public Doctor() {
		
	}
	
	public Doctor(int id, String nume, String prenume, String telefon, String email, String password) {
		super();
		this.id = id;
		this.nume = nume;
		this.prenume = prenume;
		this.telefon = telefon;
		this.email = email;
		this.password = password;
	}
	
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
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", nume=" + nume + ", prenume=" + prenume + ", telefon=" + telefon + ", email="
				+ email + ", password=" + password + "]";
	}

}
