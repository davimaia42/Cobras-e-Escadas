package com.ufc.es.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.io.IOException;
import java.net.URL;

import com.ufc.es.controller.JogoController;
import com.ufc.es.util.Music;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;



public class MenuPrincipal extends JFrame {
	JogoController jogoController;

	private JPanel contentPane;
	private JTextField txtNome1;
	private JTextField txtNome3;
	private JTextField txtNome2;
	private JTextField txtNome4;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
					Music.tocarMusica("media/music/MusicaMenu.wav");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setResizable(false);
		
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jogoController = new JogoController();
		
		
		JLabel lblNumeroDeJogadores = new JLabel("Numero de Jogadores:");
		lblNumeroDeJogadores.setBounds(10, 23, 143, 14);
		contentPane.add(lblNumeroDeJogadores);
		
		JRadioButton rdbtnJogadores2 = new JRadioButton("2 jogadores");
		rdbtnJogadores2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music.tocarEfeitoSonoro("media/music/EfeitoClick.wav");
			}
		});
		rdbtnJogadores2.setBounds(20, 50, 109, 23);
		contentPane.add(rdbtnJogadores2);
		
		JRadioButton rdbtnJogadores3 = new JRadioButton("3 jogadores");
		rdbtnJogadores3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music.tocarEfeitoSonoro("media/music/EfeitoClick.wav");
			}
		});
		rdbtnJogadores3.setBounds(130, 50, 109, 23);
		contentPane.add(rdbtnJogadores3);
		
		JRadioButton rdbtnJogadores4 = new JRadioButton("4 jogadores");
		rdbtnJogadores4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Music.tocarEfeitoSonoro("media/music/EfeitoClick.wav");
			}
		});
		rdbtnJogadores4.setBounds(241, 50, 109, 23);
		contentPane.add(rdbtnJogadores4);
		
		ButtonGroup numeroJogadores = new ButtonGroup();
		numeroJogadores.add(rdbtnJogadores2);
		numeroJogadores.add(rdbtnJogadores3);
		numeroJogadores.add(rdbtnJogadores4);
		
		JButton iniciarJogo = new JButton("Iniciar Jogo!");
		iniciarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> nomes = new ArrayList<String>();
				
				
				if(rdbtnJogadores2.isSelected()) {
					try{
						nomes.add(txtNome1.getText());
						nomes.add(txtNome2.getText());
						jogoController.iniciarNovoJogo(2, nomes, "normal");
					} catch(IOException erro) {
						JOptionPane.showMessageDialog(null, erro.getMessage());
					}
				}
				if(rdbtnJogadores3.isSelected()) {
					try{
						nomes.add(txtNome1.getText());
						nomes.add(txtNome2.getText());
						nomes.add(txtNome3.getText());
						jogoController.iniciarNovoJogo(3, nomes, "normal");
					} catch(IOException erro) {
						JOptionPane.showMessageDialog(null, erro.getMessage());
					}
				}
				if(rdbtnJogadores4.isSelected()) {
					try{
						nomes.add(txtNome1.getText());
						nomes.add(txtNome2.getText());
						nomes.add(txtNome3.getText());
						nomes.add(txtNome4.getText());
						jogoController.iniciarNovoJogo(4, nomes, "normal");
					} catch(IOException erro) {
						JOptionPane.showMessageDialog(null, erro.getMessage());
					}
				}
				Music.tocarEfeitoSonoro("media/music/EfeitoClick.wav");
				Music.pararMusica();
				TelaJogo telaJogo = new TelaJogo(jogoController);
				dispose();
				
				telaJogo.setVisible(true);
			}
		});
		iniciarJogo.setBounds(34, 228, 119, 23);
		contentPane.add(iniciarJogo);
		
		JLabel lblNomeDoJogador = new JLabel("Nome do jogador 1:");
		lblNomeDoJogador.setBounds(10, 94, 119, 14);
		contentPane.add(lblNomeDoJogador);
		
		txtNome1 = new JTextField();
		txtNome1.setBounds(20, 119, 143, 20);
		contentPane.add(txtNome1);
		txtNome1.setColumns(10);
		
		JLabel lblNomeDoJogador_1 = new JLabel("Nome do jogador 3:");
		lblNomeDoJogador_1.setBounds(10, 150, 119, 14);
		contentPane.add(lblNomeDoJogador_1);
		
		txtNome3 = new JTextField();
		txtNome3.setBounds(20, 175, 143, 20);
		contentPane.add(txtNome3);
		txtNome3.setColumns(10);
		
		JButton btnListar = new JButton("listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, jogoController.listarJogadores());
			}
		});
		btnListar.setBounds(215, 228, 89, 23);
		contentPane.add(btnListar);
		
		JLabel lblNomeDoJogador_2 = new JLabel("Nome do Jogador 2:");
		lblNomeDoJogador_2.setBounds(185, 94, 119, 14);
		contentPane.add(lblNomeDoJogador_2);
		
		txtNome2 = new JTextField();
		txtNome2.setBounds(195, 119, 143, 20);
		contentPane.add(txtNome2);
		txtNome2.setColumns(10);
		
		JLabel lblNomeDoJogador_3 = new JLabel("Nome do Jogador 4:");
		lblNomeDoJogador_3.setBounds(185, 150, 119, 14);
		contentPane.add(lblNomeDoJogador_3);
		
		txtNome4 = new JTextField();
		txtNome4.setBounds(195, 175, 143, 20);
		contentPane.add(txtNome4);
		txtNome4.setColumns(10);
	}
}
