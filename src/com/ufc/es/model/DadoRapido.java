package com.ufc.es.model;

import java.util.Random;

public class DadoRapido implements IDado{
	private Random numeroAleatorio = new Random();

	public int rolarDado() {
		return (numeroAleatorio.nextInt(6) + 1) * 2;
	}
}
