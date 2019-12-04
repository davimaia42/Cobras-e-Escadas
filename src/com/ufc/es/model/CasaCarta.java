package com.ufc.es.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CasaCarta extends Casa implements EventoEspecial{
	private List<Carta> cartas = new ArrayList<Carta>(6);
	
	public CasaCarta() {
		super();
	}

	public CasaCarta(int numCasa,int posicaoX, int posicaoY) {
		super(numCasa,posicaoX, posicaoY);
		this.cartas.add(new Carta(1, true));
		this.cartas.add(new Carta(2, true));
		this.cartas.add(new Carta(3, true));
		this.cartas.add(new Carta(1, false));
		this.cartas.add(new Carta(2, false));
		this.cartas.add(new Carta(3, false));
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
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
		this.posicaoX = posicaoY;
		
	}
	@Override
	public String toString() {
		return "CasaCarta [numCasa=" + numCasa + ", posicaoX=" + posicaoX + ", posicaoY=" + posicaoY + "]";
	}
	@Override
	public void realizaEvento(Jogador jogador) {
		Random rand = new Random();
		Carta cartaSorteada = cartas.get(rand.nextInt(cartas.size()));
		if(cartaSorteada.isIrVoltar()) {
			jogador.setCasaAtual(Tabuleiro.getInstance().getCasa(this.numCasa + cartaSorteada.getNumero()));
			jogador.getCasaAtual().realizaEvento(jogador);
		} else {
			jogador.setCasaAtual(Tabuleiro.getInstance().getCasa(this.numCasa - cartaSorteada.getNumero()));
			jogador.getCasaAtual().realizaEvento(jogador);
		}
	}
}
