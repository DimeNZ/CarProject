package fi.agileo.carproject.domain;

public class Auto {
	private String merkki;
	private String malli;
	private double huippuNopeus;
	private Ajaja ajaja;
	private Moottori moottori;

	public Auto(String merkki, String malli, double huippuNopeus, Ajaja ajaja, Moottori moottori) {
		super();
		this.merkki = merkki;
		this.malli = malli;
		this.huippuNopeus = huippuNopeus;
		this.ajaja = ajaja;
		this.moottori = moottori;
	}

	public double getHuippuNopeus() {
		return huippuNopeus;
	}

	public void setHuippuNopeus(double huippuNopeus) {
		this.huippuNopeus = huippuNopeus;
	}

	public String getMerkki() {
		return merkki;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public String getMalli() {
		return malli;
	}

	public void setMalli(String malli) {
		this.malli = malli;
	}

	public Ajaja getAjaja() {
		return ajaja;
	}

	public void setAjaja(Ajaja ajaja) {
		this.ajaja = ajaja;
	}

	public Moottori getMoottori() {
		return moottori;
	}

	public void setMoottori(Moottori moottori) {
		this.moottori = moottori;
	}

	public double laskeNopeus() {
		double paluuArvo;
		
		paluuArvo = (moottori.getSylinterienMaara() - moottori.getSylintereitaRikki()) * huippuNopeus /
						moottori.getSylinterienMaara();
		// TODO Auto-generated method stub
		return paluuArvo;
	}

}
