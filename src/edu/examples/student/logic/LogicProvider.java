package edu.examples.student.logic;

import edu.examples.student.logic.ipl.StudentLogicImpl;

//import edu.examples.student.logic.impl.StudentLogicImpl;

public class LogicProvider {
	private static final LogicProvider instance = new LogicProvider();

	private final StudentLogic studentLogic = new StudentLogicImpl();

	private LogicProvider() {
	}

	public static LogicProvider getInstance() {
		return instance;
	}

	public StudentLogic getStudentLogic() {
		return studentLogic;
	}
}