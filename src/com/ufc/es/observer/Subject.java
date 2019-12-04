package com.ufc.es.observer;

import com.ufc.es.model.Jogador;

public interface Subject {
	public void attach(Observer observer);
	public void disattach(Observer observer);
	public void notifica(Jogador jogador);
}
