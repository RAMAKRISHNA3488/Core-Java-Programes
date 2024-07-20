package com.medium;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameDemo {
	public static void main(String[] args) {
		JFrame frame=new JFrame("Frame Example");
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label=new JLabel("Frame by Example");
		
		JButton button=new JButton();
		button.setText("Student");
		panel.add(label);
		button.add(button);
		frame.add(panel);
		frame.setSize(200,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(0);
		frame.setVisible(true);
		
		
	}

}
