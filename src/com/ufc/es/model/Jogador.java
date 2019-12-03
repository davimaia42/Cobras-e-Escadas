package com.ufc.es.model;

public class Jogador {
	private String nome;
	private Casa casaAtual;
	
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
	}
	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", casaAtual=" + casaAtual.toString() + "]";
	}
	
}
