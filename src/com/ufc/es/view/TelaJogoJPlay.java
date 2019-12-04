package com.ufc.es.view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jplay.GameImage;
import jplay.Window;

public class TelaJogoJPlay extends JPanel{
	Window janela;
	GameImage jogador1;
	GameImage fundo;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		Window janela = new Window(512, 600);
		GameImage jogador1 = new GameImage("media/img/peaozuado.png");
		jogador1.x = 48;
		jogador1.y = 460;
		GameImage fundo = new GameImage("media/img/tabuleiroImg.jpg");
		fundo.draw();
		jogador1.draw();
		janela.update();
	}
	public TelaJogoJPlay() {
		
		JLabel dado = new JLabel("");
		dado.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/dado6.png")));
		dado.setBounds(29, 549, 84, 84);
		
		janela = new Window(512, 600);
		jogador1 = new GameImage("media/img/peaozuado.png");
		jogador1.x = 48;
		jogador1.y = 460;
		fundo = new GameImage("media/img/tabuleiroImg.jpg");
		
	}
	public void display() {
		fundo.draw();
		jogador1.draw();
		janela.update();
	}
}
