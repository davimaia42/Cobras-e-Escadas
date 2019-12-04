package com.ufc.es.model;

public class CasaSobeDesce extends Casa implements EventoEspecial{
	private int destinoPosicaoX;
	private int destinoPosicaoY;
	
	
	public CasaSobeDesce(int numCasa ,int posicaoX, int posicaoY, int destPosicaoX, int destPosicaoY) {
		super(numCasa,posicaoX, posicaoY);
		this.destinoPosicaoX = destPosicaoX;
		this.destinoPosicaoY = destPosicaoY;
	}

	public int getDestPosicaoX() {
		return destinoPosicaoX;
	}

	public void setDestPosicaoX(int sobePosicaoX) {
		this.destinoPosicaoX = sobePosicaoX;
	}

	public int getDestPosicaoY() {
		return destinoPosicaoY;
	}

	public void setDestPosicaoY(int sobePosicaoY) {
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

	@Override
	public void realizaEvento(Jogador jogador) {
		jogador.setCasaAtual(Tabuleiro.getInstance().getCasaByPosicao(this.destinoPosicaoX, this.destinoPosicaoY));
	}

}
