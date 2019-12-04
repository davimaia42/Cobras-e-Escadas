package com.ufc.es.controller;

import com.ufc.es.iterador.Iterador;
import com.ufc.es.iterador.IteradorJogador;
import com.ufc.es.model.Casa;
import com.ufc.es.model.CasaSobeDesce;
import com.ufc.es.model.Dado;
import com.ufc.es.model.DadoRapido;
import com.ufc.es.model.IDado;
import com.ufc.es.model.Jogador;
import com.ufc.es.model.Jogo;
import com.ufc.es.model.Tabuleiro;

import java.io.IOException;
import java.util.ArrayList;

public class JogoController {
	private Jogo jogoAtual;
	private IDado dado;
	private IteradorJogador jogadorIterador;
	private Jogador jogadorDaVez;
	public void iniciarNovoJogo(int numeroDeJogadores, ArrayList<String> nomes, String tipoJogo) throws IOException{
		if(numeroDeJogadores < 2)
			throw new IOException("Minimo de jogadores e 2");
		else if(numeroDeJogadores > 4)
			throw new IOException("Maximo de jogadores e 4");
		else {
			this.jogoAtual = new Jogo(numeroDeJogadores, nomes);
			jogadorIterador = jogoAtual.criaIterador();
			jogadorDaVez = jogadorIterador.proximo();
			switch(tipoJogo) {
				case "normal": dado = new Dado(); break;
				case "rapido": dado = new DadoRapido(); break;
			}
		}
	}
	public int moverJogador() {
		
		int rolagem = dado.rolarDado();
		
		int numCasaDestino = this.jogadorDaVez.getCasaAtual().getNumCasa() + rolagem;
		Casa casaDestino = Tabuleiro.getInstance().getCasa(numCasaDestino);
		
		this.jogadorDaVez.setCasaAtual(casaDestino);
		this.jogadorDaVez.getCasaAtual().realizaEvento(this.jogadorDaVez);
		
		this.jogadorDaVez = this.jogadorIterador.proximo();
		
		return rolagem;
	}
	
	public void proximoJogador() {
		this.jogadorDaVez = jogadorIterador.proximo();
	}
	public String listarJogadores() {
		return jogoAtual.toString();
	}
	public String getNomeJogadorDaVez() {
		return jogadorDaVez.getNome();
	}
}
