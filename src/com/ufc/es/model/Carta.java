package com.ufc.es.model;

public class Carta {
	private int numero;
	private boolean irVoltar;
	
	
	
	public Carta() {
		super();
	}
	public Carta(int numero, boolean irVoltar) {
		super();
		this.numero = numero;
		this.irVoltar = irVoltar;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isIrVoltar() {
		return irVoltar;
	}
	public void setIrVoltar(boolean irVoltar) {
		this.irVoltar = irVoltar;
	}
	
	
}
