package com.ufc.es.iterador;

import java.util.ArrayList;
import java.util.Iterator;

import com.ufc.es.model.Jogador;

public class IteradorJogador implements Iterador<Jogador>{
	Iterator<Jogador> jogadoresIt;
	ArrayList<Jogador> jogadoresList;
	
	public IteradorJogador(ArrayList<Jogador> jogadores) {
		this.jogadoresList = jogadores;
		this.jogadoresIt = jogadores.iterator();
	}
	
	public boolean temProximo() {
		return true;
	}
	
	public Jogador proximo() {
		if(!jogadoresIt.hasNext())
			jogadoresIt = jogadoresList.iterator();
		return jogadoresIt.next();
	}
}
