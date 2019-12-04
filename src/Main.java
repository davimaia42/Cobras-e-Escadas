import com.ufc.es.model.*;

import java.io.IOException;
import java.util.ArrayList;

import com.ufc.es.controller.*;
public class Main {

	public static void main(String[] args) {
		/*for(int i = 58; i <= 100; i++) {
			Casa casa4 = Tabuleiro.getInstance().getCasa(i);
			System.out.println(casa4.toString());
		}*/
		//14
		//38
		//53
		//57
		//60
		for(Casa c : Tabuleiro.getInstance().getCasas())
			System.out.println(c.toString());
	}
}
