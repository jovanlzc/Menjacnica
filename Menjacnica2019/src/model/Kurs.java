package model;

public class Kurs {
	private double prodajni;
	private double kupovni;
	private double srednji;
	
	public Kurs() {
		
	}
	public Kurs(double prodajni,double kupovni,double srednji) {
		this.prodajni=prodajni;
		this.kupovni=kupovni;
		this.srednji=srednji;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	
	
}