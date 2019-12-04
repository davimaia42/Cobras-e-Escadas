package com.ufc.es.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
	static Clip clipMusica;
	static Clip clipEfeitoSonoro;
	public static void tocarMusica(String caminhoArquivo) {
		try {
			File caminhoMusica = new File(caminhoArquivo);
			if(caminhoMusica.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(caminhoMusica);
				clipMusica = AudioSystem.getClip();
				clipMusica.open(audioInput);
				clipMusica.start();
				clipMusica.loop(Clip.LOOP_CONTINUOUSLY);
			}
			else {
				System.out.println("Musica n existe");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void tocarEfeitoSonoro(String caminhoArquivo) {
		try {
			File caminhoEfeitoSonoro = new File(caminhoArquivo);
			if(caminhoEfeitoSonoro.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(caminhoEfeitoSonoro);
				clipEfeitoSonoro = AudioSystem.getClip();
				clipEfeitoSonoro.open(audioInput);
				clipEfeitoSonoro.start();
			}
			else {
				System.out.println("Efeito sonoro nao encontrado");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void pararMusica() {
		clipMusica.stop();
	}
}
