package com.ufc.es.fabrica;

import com.ufc.es.model.Casa;
import com.ufc.es.model.CasaCarta;
import com.ufc.es.model.CasaSobeDesce;

public class FabricaCasa implements IFabricaCasa{
	public Casa criaCasa(int x, int y) {
		//escada casa 4
		if(x == 3 && y == 0) {
			return new CasaSobeDesce(4,x+1,y+1,14);
		}
		//escada casa 9
		else if(x == 8 && y == 0) {
			return new CasaSobeDesce(9,x+1,y+1,31);
		}
		//cobra casa 17
		else if(x == 3 && y == 1) {
			return new CasaSobeDesce(17,x+1,y+1,7);
		}
		//escada casa 21 
		else if(x == 0 && y == 2) {
			return new CasaSobeDesce(21,x+1,y+1,42);
		}
		//escada casa 28
		else if(x == 7 && y == 2) {
			return new CasaSobeDesce(28,x+1,y+1,84);
		}
		//escada casa 51
		else if(x == 9 && y == 5) {
			return new CasaSobeDesce(51,x+1,y+1,67);
		}
		//cobra casa 54
		else if(x == 6 && y == 5) {
			return new CasaSobeDesce(54,x+1,y+1,34);
		}
		//cobra casa 62
		else if(x == 1 && y == 6) {
			return new CasaSobeDesce(62,x+1,y+1,19);
		}
		//cobra casa 64
		else if(x == 3 && y == 6) {
			return new CasaSobeDesce(64,x+1,y+1,60);
		}
		//escada casa 80
		else if(x == 0 && y == 7) {
			return new CasaSobeDesce(80,x+1,y+1,99);
		}
		//escada casa 72
		else if(x == 8 && y == 7) {
			return new CasaSobeDesce(72,x+1,y+1,91);
		}
		//cobra casa 87
		else if(x == 6 && y == 8) {
			return new CasaSobeDesce(87,x+1,y+1,36);
		}
		//cobra casa 93
		else if(x == 7 && y == 9) {
			return new CasaSobeDesce(93,x+1,y+1,73);
		}
		//cobra casa 95
		else if(x == 5 && y == 9) {
			return new CasaSobeDesce(95,x+1,y+1,75);
		}
		//cobra casa 98
		else if(x == 2 && y == 9) {
			return new CasaSobeDesce(98,x+1,y+1,79);
		}
		//trunfo casa 33
		else if(x == 7 && y == 3) {
			return new CasaCarta(33,x+1,y+1);
		}
		//trunfo casa 94
		else if(x == 6 && y == 9) {
			return new CasaCarta(94,x+1,y+1);
		}
		//trunfo casa 77
		else if(x == 3 && y == 7) {
			return new CasaCarta(77,x+1,y+1);
		}
		//trunfo casa 58
		else if(x == 2 && y == 5) {
			return new CasaCarta(58,x+1,y+1);
		}
		//trunfo casa 8
		else if(x == 7 && y == 0) {
			return new CasaCarta(8,x+1,y+1);
		}
		//trunfo casa 35
		else if(x == 5 && y == 3) {
			return new CasaCarta(35,x+1,y+1);
		}
		//casa comuns
		else {
			int xFixed = x;
			if(y%2 != 0)
				xFixed = 9 - x;
			
			return new Casa(y*10+xFixed+1,xFixed+1,y+1);
		}
	}
}