package com.plxue.interview.designpatterns.builtin.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DavidListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		System.out.println("Come on, do it!");
	}

}
