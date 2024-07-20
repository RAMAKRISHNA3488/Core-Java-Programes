package com.medium;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo extends JFrame {
	SwingDemo() {
		JLabel l = new JLabel("Hello World");
		JLabel l1 = new JLabel("wellcome Rama");
		JFrame s = new JFrame();
		s.setVisible(true);
		s.setSize(200, 200);
		s.add(l);
		s.add(l1);
		s.setLayout(new FlowLayout());
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SwingDemo sd = new SwingDemo();
		System.out.println(sd);

	}

}
