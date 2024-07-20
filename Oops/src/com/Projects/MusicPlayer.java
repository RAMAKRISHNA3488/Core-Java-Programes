package com.Projects;

import java.awt.Event;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {
	private Clip clip;
	private boolean isPaused = false;

	public void play(String filePath) {

		try {
			File audioFile = new File(filePath);
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			System.out.println("Playing music: "+filePath);
			
			clip.addLineListener(event ->{
				if(event.getType()==LineEvent.Type.STOP) {
					System.out.println("Music playback completed.");
					clip.close();
				}
			});
		} catch (UnsupportedAudioFileException | IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}

	}
	
	public void pause() {
		if(clip !=null && isPaused) {
			clip.stop();
			isPaused=true;
			System.out.println("Music paused.");
		}
	}
	
	public void resume() {
		if(clip !=null && isPaused) {
			clip.start();
			isPaused=false;
			System.out.println("Music resume.");
		}
	}

	public static void main(String[] args) {
		MusicPlayer musicPlayer=new MusicPlayer();
		String filePath="C:\\Users\\ramak\\Downloads\\Andham Vadi Choopera - SenSongsMp3.Com";
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		musicPlayer.pause();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
		musicPlayer.resume();
	}

}
