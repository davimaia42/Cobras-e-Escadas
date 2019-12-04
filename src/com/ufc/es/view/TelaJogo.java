package com.ufc.es.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ufc.es.controller.JogoController;
import com.ufc.es.util.Music;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaJogo extends JFrame {
	
	JogoController jogoController;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogo frame = new TelaJogo();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaJogo() {
		setResizable(false);
		setTitle("Cobras e Escadas");
		Music.tocarMusica("media/music/MusicaJogo.wav");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tabuleiroImg = new JLabel("");
		tabuleiroImg.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/tabuleiroImg.jpg")));
		tabuleiroImg.setBounds(0, 0, 512, 512);
		contentPane.add(tabuleiroImg);
		
		JLabel dado = new JLabel("");
		dado.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/dado6.png")));
		dado.setBounds(29, 549, 84, 84);
		contentPane.add(dado);
		
		JLabel lblAVez = new JLabel("A vez \u00E9 do jogador:");
		lblAVez.setBounds(123, 549, 115, 14);
		contentPane.add(lblAVez);
		
		JLabel lblNomeJogadorDaVez = new JLabel("");
		lblNomeJogadorDaVez.setBounds(235, 549, 243, 14);
		contentPane.add(lblNomeJogadorDaVez);
		
		JButton btnRolarDado = new JButton("Rolar dado");
		btnRolarDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogoController.proximoJogador();
			}
		});
		btnRolarDado.setBounds(123, 610, 115, 23);
		contentPane.add(btnRolarDado);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, jogoController.listarJogadores());
			}
		});
		btnMostrar.setBounds(348, 610, 89, 23);
		contentPane.add(btnMostrar);
	}
	public static void exibirMensagem(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	public TelaJogo(JogoController jogoController) {
		Music.tocarMusica("media/music/MusicaJogo.wav");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tabuleiroImg = new JLabel("");
		tabuleiroImg.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/tabuleiroImg.jpg")));
		tabuleiroImg.setBounds(0, 0, 512, 512);
		contentPane.add(tabuleiroImg);
		
		JLabel dado = new JLabel("");
		dado.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/dado6.png")));
		dado.setBounds(29, 549, 84, 84);
		contentPane.add(dado);
		
		JLabel lblAVez = new JLabel("A vez \u00E9 do jogador:");
		lblAVez.setBounds(123, 549, 115, 14);
		contentPane.add(lblAVez);
		
		JLabel lblNomeJogadorDaVez = new JLabel(jogoController.getNomeJogadorDaVez());
		lblNomeJogadorDaVez.setBounds(235, 549, 243, 14);
		contentPane.add(lblNomeJogadorDaVez);
		
		JButton btnRolarDado = new JButton("Rolar dado");
		btnRolarDado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music.tocarEfeitoSonoro("media/music/EfeitoDado.wav");
				
				int rolagem = jogoController.moverJogador();
				switch(rolagem) {
					case 1: dado.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/dado1.png")));
							break;
					case 2: dado.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/dado2.png")));
							break;
					case 3: dado.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/dado3.png")));
							break;
					case 4: dado.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/dado4.png")));
							break;
					case 5: dado.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/dado5.png")));
							break;
					case 6: dado.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/dado6.png")));
							break;
				}
				lblNomeJogadorDaVez.setText(jogoController.getNomeJogadorDaVez());
			}
		});
		btnRolarDado.setBounds(123, 610, 115, 23);
		contentPane.add(btnRolarDado);
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, jogoController.listarJogadores());
			}
		});
		btnMostrar.setBounds(348, 610, 89, 23);
		contentPane.add(btnMostrar);
		
		JLabel peao1 = new JLabel("");
		peao1.setIcon(new ImageIcon(TelaJogo.class.getResource("/img/peao1.png")));
		peao1.setBounds(10, 461, 16, 23);
		contentPane.add(peao1);
	}
}
