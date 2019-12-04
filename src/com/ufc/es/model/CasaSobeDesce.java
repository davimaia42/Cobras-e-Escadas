package com.ufc.es.model;

public class CasaSobeDesce extends Casa implements EventoEspecial{
	private int numCasaDestino;
	
	
	public CasaSobeDesce(int numCasa ,int posicaoX, int posicaoY, int numCasaDestino) {
		super(numCasa,posicaoX, posicaoY);
		this.numCasaDestino = numCasaDestino;
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
		return "CasaSobeDesce " + numCasa;
	}

	@Override
	public void realizaEvento(Jogador jogador) {
		jogador.setCasaAtual(Tabuleiro.getInstance().getCasa(this.numCasaDestino));
	}

}
