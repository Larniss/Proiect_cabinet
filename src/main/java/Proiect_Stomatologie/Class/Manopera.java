package Proiect_Stomatologie.Class;

public class Manopera {

	private String tipulManoperei;
	private double pret;
	
	public Manopera(String tipulManoperei, double pret) {
		super();
		this.tipulManoperei = tipulManoperei;
		this.pret = pret;
	}
	
	public String getTipulManoperei() {
		return tipulManoperei;
	}

	public void setTipulManoperei(String tipulManoperei) {
		this.tipulManoperei = tipulManoperei;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}
	
	@Override
	public String toString() {
		return "Manopera [tipulManoperei=" + tipulManoperei + ", pret=" + pret + "]";
	}
}
