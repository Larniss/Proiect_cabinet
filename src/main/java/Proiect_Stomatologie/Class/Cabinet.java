package Proiect_Stomatologie.Class;




public class Cabinet {
	int numarCabinet;
	String culoare;
	boolean disponibil;
	
	public Cabinet(int numarCabinet, String culoare, boolean disponibil) {
		this.numarCabinet = numarCabinet;
		this.culoare = culoare;
		this.disponibil = disponibil;
	}
	
	public int getNumarCabinet() {
		return numarCabinet;
	}

	public void setNumarCabinet(int numarCabinet) {
		this.numarCabinet = numarCabinet;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public boolean isDisponibil() {
		return disponibil;
	}

	public void setDisponibil(boolean disponibil) {
		this.disponibil = disponibil;
	}
	
	public boolean Disponibilitate(boolean disponibil) { //aici trebuie modificat cu legatura cu programare sa te lase sa faci programare daca e disponibil cabinetul
		if(disponibil) {
			return true;
		}
		else
			return false;
	}
}
