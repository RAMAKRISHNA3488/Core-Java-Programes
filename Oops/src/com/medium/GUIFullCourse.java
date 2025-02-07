package com.medium;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIFullCourse {
	public static void main(String[] args) {
		JFrame frame = new JFrame();// creates a frame
		frame.setTitle("JFrames on GUI");// Sets the title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
		JLabel l1 = new JLabel("wellcome Rama");
		System.out.println(l1);
		// frame.setResizable(false);//prevent frame from being resized
		frame.setSize(500, 500);// set the size
		frame.setVisible(true);// make frame visible

		ImageIcon image = new ImageIcon("ram.jpg");// create an Image icon
		frame.setIconImage(image.getImage());// change icon of frame
		frame.getContentPane().setBackground(Color.DARK_GRAY);// change color of background

	}

}
