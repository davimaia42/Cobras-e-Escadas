package com.ufc.es.model;

public class CasaSobeDesce extends Casa{
	private int destinoPosicaoX;
	private int destinoPosicaoY;
	
	
	public CasaSobeDesce(int numCasa ,int posicaoX, int posicaoY, int sobePosicaoX, int sobePosicaoY) {
		super(numCasa,posicaoX, posicaoY);
		this.destinoPosicaoX = sobePosicaoX;
		this.destinoPosicaoY = sobePosicaoY;
	}

	public int getSobePosicaoX() {
		return destinoPosicaoX;
	}

	public void setSobePosicaoX(int sobePosicaoX) {
		this.destinoPosicaoX = sobePosicaoX;
	}

	public int getSobePosicaoY() {
		return destinoPosicaoY;
	}

	public void setSobePosicaoY(int sobePosicaoY) {
		this.destinoPosicaoY = sobePosicaoY;
	}

	@Override
	public int getPosicaoX() {
		// TODO Auto-generated method stub
		return this.posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		// TODO Auto-generated method stub
		this.posicaoX = posicaoX;
	}
	@Override
	public int getPosicaoY() {
		// TODO Auto-generated method stub
		return this.posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		// TODO Auto-generated method stub
		this.posicaoY = posicaoY;
	}
	@Override
	public String toString() {
		return "CasaSobeDesce [numCasa=" + numCasa + ", posicaoX=" + posicaoX + ", posicaoY=" + posicaoY + "]";
	}

}
