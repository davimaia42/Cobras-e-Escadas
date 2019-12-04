package com.ufc.es.model;

import java.util.ArrayList;
import java.util.List;
import com.ufc.es.fabrica.*;

public class Tabuleiro {
	private static Tabuleiro unniqueInstance = new Tabuleiro();
	private IFabricaCasa fabricaCasa = new FabricaCasa();
	private List<Casa> casas = new ArrayList<Casa>(100); 
	private Tabuleiro() {
		for(int y = 0; y < 10; y++) {
			for(int x = 0; x < 10; x++) {
				this.casas.add(fabricaCasa.criaCasa(x, y));
			}
		}
		
	}
	
	public static Tabuleiro getInstance(){
		return unniqueInstance;
	}

	public List<Casa> getCasas() {
		return casas;
	}
	public Casa getCasa(int numCasa) {
		for(Casa c : this.casas) {
			if(c.getNumCasa() == numCasa)
				return c;
		}
		return null;
	}
	public Casa getCasaByPosicao(int x, int y) {
		for(Casa c : casas) {
			if(c.getPosicaoX() == x && c.getPosicaoY() == y) {
				return c;
			}
		}
		return null;
	}
}
