package com.ufc.es.controller;

import com.ufc.es.model.Dado;
import com.ufc.es.model.DadoRapido;
import com.ufc.es.model.IDado;
import com.ufc.es.model.Jogo;

import java.io.IOException;
import java.util.ArrayList;

public class JogoController {
	private Jogo jogoAtual;
	private IDado dado;
	public void iniciarNovoJogo(int numeroDeJogadores, ArrayList<String> nomes, String tipoJogo) throws IOException{
		if(numeroDeJogadores < 2)
			throw new IOException("Minimo de jogadores e 2");
		else if(numeroDeJogadores > 4)
			throw new IOException("Maximo de jogadores e 4");
		else {
			this.jogoAtual = new Jogo(numeroDeJogadores, nomes);
			switch(tipoJogo) {
				case "normal": dado = new Dado(); break;
				case "rapido": dado = new DadoRapido(); break;
			}
		}
	}
	public void moverJogador(int numeroJogador) {
		int rolagem = dado.rolarDado();
		System.out.println(rolagem);
		jogoAtual.moverJogador(numeroJogador, rolagem);
	}
	public String listarJogadores() {
		return jogoAtual.toString();
	}
	
}
