package edu.examples.student.controller.impl;

import edu.examples.student.controller.Command;
import edu.examples.student.logic.StudentLogic;
import edu.examples.student.logic.LogicProvider;

public class UpdateStudentCommand implements Command {
	private final StudentLogic logic = LogicProvider.getInstance().getStudentLogic();

	@Override
	public void execute(String request) {
		String[] params = request.split(" ", 3);
		int id = Integer.parseInt(params[1]);
		String name = params[2];
		logic.updateStudent(id, name);
	}
}