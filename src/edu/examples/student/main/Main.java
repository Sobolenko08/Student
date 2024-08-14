package edu.examples.student.main;

import edu.examples.student.controller.Controller;

public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.executeTask("ADD_STUDENT Соболенко Александр");
		controller.executeTask("UPDATE_STUDENT 0 Вася Пупкин");
		controller.executeTask("GET_ALL_STUDENTS");
	}
}