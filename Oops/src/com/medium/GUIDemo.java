package com.medium;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIDemo {
	
	public static void main(String[] args) {
		JFrame Jframe = new JFrame("My Application");

		JButton button = new JButton("Click me!");
		Jframe.add(button);
		System.out.println(button);
		Jframe.setLayout(new FlowLayout());
		Jframe.setSize(50000, 1000);
		Jframe.setVisible(true);
		System.out.println(Jframe);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Clicked!");
				JButton button = new JButton("Button Clicked!");
				Jframe.add(button);
				Jframe.setLayout(new FlowLayout());
				Jframe.setSize(50000, 1000);
				Jframe.setVisible(true);
				System.out.println(Jframe);

			}
		});
	}

}
