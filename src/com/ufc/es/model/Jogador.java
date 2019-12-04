package com.ufc.es.model;

import java.util.ArrayList;

import com.ufc.es.observer.*;

public class Jogador implements Subject{
	private String nome;
	private Casa casaAtual;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public Jogador() {
		super();
	}
	
	public Jogador(String nome, Casa casaAtual) {
		super();
		this.nome = nome;
		this.casaAtual = casaAtual;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Casa getCasaAtual() {
		return casaAtual;
	}
	public void setCasaAtual(Casa casaAtual) {
		this.casaAtual = casaAtual;
		if(casaAtual.getNumCasa() == 100) {
			this.notifica(this);
		}
	}
	@Override
	public String toString() {
		return nome + " - " + casaAtual.toString();
	}
	@Override
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	@Override
	public void disattach(Observer observer) {
		this.observers.remove(observer);
	}
	@Override
	public void notifica(Jogador jogador) {
		for(Observer ob : this.observers) {
			ob.update(jogador);
		}
	}
	
}
