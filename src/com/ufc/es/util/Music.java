package com.ufc.es.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
	static Clip clip;
	public static void tocarMusica(String caminhoArquivo) {
		try {
			File caminhoMusica = new File(caminhoArquivo);
			if(caminhoMusica.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(caminhoMusica);
				clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
			}
			else {
				System.out.println("Musica n existe");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void pararMusica() {
		clip.stop();
	}
}
