package com.AnimationBasics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MenuItemHandler implements ActionListener, ItemListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		String s=e.getActionCommand();
		if(s=="Exit") {
			System.exit(0);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	}

}
