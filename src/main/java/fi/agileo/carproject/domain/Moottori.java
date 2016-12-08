package fi.agileo.carproject.domain;

public class Moottori {
	private double teho;
	private int sylinterienMaara;
	private int sylintereitaRikki;
	
	public Moottori(double teho, int sylinterienMaara, int sylintereitaRikki) {
		super();
		this.teho = teho;
		this.sylinterienMaara = sylinterienMaara;
		this.sylintereitaRikki = sylintereitaRikki;
	}
	public double getTeho() {
		return teho;
	}
	public void setTeho(double teho) {
		this.teho = teho;
	}
	public int getSylinterienMaara() {
		return sylinterienMaara;
	}
	public void setSylinterienMaara(int sylinterienMaara) {
		this.sylinterienMaara = sylinterienMaara;
	}
	public int getSylintereitaRikki() {
		return sylintereitaRikki;
	}
	public void setSylintereitaRikki(int sylintereitaRikki) {
		this.sylintereitaRikki = sylintereitaRikki;
	}
	
	

}
