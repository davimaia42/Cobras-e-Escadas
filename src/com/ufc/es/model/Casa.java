package com.ufc.es.model;

public class Casa implements EventoEspecial{
	int numCasa;
	int posicaoX;
	int posicaoY;
	
	public int getNumCasa() {
		return numCasa;
	}
	public  int getPosicaoX() {
		return this.posicaoX;
	}
	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}
	
	public int getPosicaoY() {
		return this.posicaoY;
	}
	public void setPosicaoY(int posicaoT) {
		this.posicaoY = posicaoT;
	}
	
	public Casa(int numCasa, int posicaoX, int posicaoY) {
		this.numCasa = numCasa;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}
	
	public Casa() {
		
	}
	@Override
	public String toString() {
		return "casa " + numCasa ;
	}
	@Override
	public void realizaEvento(Jogador jogador) {
	}
}
