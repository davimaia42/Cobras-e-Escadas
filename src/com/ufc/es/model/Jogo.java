package com.ufc.es.model;

import java.util.ArrayList;
import java.util.List;
import com.ufc.es.model.Tabuleiro;

public class Jogo {
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public Jogo() {
		
	}
	public Jogo(int numeroDeJogadores, ArrayList<String> nomes) {
		for(int i = 0; i < numeroDeJogadores; i++) {
			this.jogadores.add(new Jogador(nomes.get(i), Tabuleiro.getInstance().getCasas().get(0)));
		}
	}
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	public void moverJogador(int numeroJogador, int numeroCasas) {
		int numCasaDestino = jogadores.get(numeroJogador).getCasaAtual().getNumCasa() + numeroCasas;
		Casa casaDestino = Tabuleiro.getInstance().getCasa(numCasaDestino);
		
		this.jogadores.get(numeroJogador).setCasaAtual(casaDestino);
	}
	@Override
	public String toString() {
		String saida = new String();
		for(Jogador j : this.jogadores)
			saida += j.toString() + "\n";
		return saida;
	}
	
}
