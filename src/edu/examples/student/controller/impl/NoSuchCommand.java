package edu.examples.student.controller.impl;

import edu.examples.student.controller.Command;

public class NoSuchCommand implements Command {
	@Override
	public void execute(String request) {
		System.out.println("No such command: " + request);
	}
}