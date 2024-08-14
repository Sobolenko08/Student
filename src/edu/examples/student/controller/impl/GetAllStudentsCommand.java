package edu.examples.student.controller.impl;

import edu.examples.student.controller.Command;
import edu.examples.student.logic.StudentLogic;
import edu.examples.student.logic.LogicProvider;

public class GetAllStudentsCommand implements Command {
	private final StudentLogic logic = LogicProvider.getInstance().getStudentLogic();

	@Override
	public void execute(String request) {
		logic.getAllStudents().forEach(System.out::println);
	}
}