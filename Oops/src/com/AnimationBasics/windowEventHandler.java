package com.AnimationBasics;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class windowEventHandler extends WindowAdapter {

	public void WindowClosing(WindowEvent e) {
		System.exit(0);
		
	}

}
