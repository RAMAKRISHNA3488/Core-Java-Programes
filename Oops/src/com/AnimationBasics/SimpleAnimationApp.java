package com.AnimationBasics;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class SimpleAnimationApp extends Frame implements Runnable {
	Thread animation;
	int frameDelay = 100;
	String frames[] = { "*", "**", "***", "****", "*****", "****", "***", "**", "*" };
	int numFrams = frames.length;
	int currentframe = 0;
	long lastDisplay = 0;
	String menuItems[][] = { { "File", "Exit" } };
	MenuItemHandler mih = new MenuItemHandler();
	MyMenuBar menuBar = new MyMenuBar(menuItems, mih, mih);
	int screenWidth = 200;
	int screenHeight = 200;

	public static void main(String[] args) {
		SimpleAnimationApp app = new SimpleAnimationApp();
	}

	SimpleAnimationApp() {
		super("Simple Animation");
		setup();
		setSize(screenWidth, screenHeight);
		addWindowFocusListener(new windowEventHandler());
		show();
		animation = new Thread(this);
		animation.start();
	}

	void setup() {

		setMenuBar(menuBar);
		setFont(new Font("default", Font.BOLD, 18));

	}
	private void setMenuBar(com.AnimationBasics.MyMenuBar menuBar2) {
		
	}

	public void paint(Graphics g) {
		g.drawString(frames[currentframe], 60, 60);
	}

	@Override
	public void run() {
		do {
			long time=System.currentTimeMillis();
			if(time-lastDisplay>frameDelay) {
				repaint();
				try {
					Thread.sleep(frameDelay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				++currentframe;
				currentframe %=numFrams;
				lastDisplay=time;
			}
		}while(true);

	}
	private void MyMenuBar() {

	} 

}
