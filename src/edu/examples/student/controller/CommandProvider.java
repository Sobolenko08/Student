package edu.examples.student.controller;

import edu.examples.student.controller.impl.AddStudentCommand;
import edu.examples.student.controller.impl.UpdateStudentCommand;
import edu.examples.student.controller.impl.GetAllStudentsCommand;
import edu.examples.student.controller.impl.NoSuchCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
	private final Map<CommandName, Command> repository = new HashMap<>();

	public CommandProvider() {
		repository.put(CommandName.ADD_STUDENT, new AddStudentCommand());
		repository.put(CommandName.UPDATE_STUDENT, new UpdateStudentCommand());
		repository.put(CommandName.GET_ALL_STUDENTS, new GetAllStudentsCommand());
	}

	public Command getCommand(String name) {
		CommandName commandName;
		Command command;

		try {
			commandName = CommandName.valueOf(name.toUpperCase());
			command = repository.get(commandName);
		} catch (IllegalArgumentException | NullPointerException e) {
			command = new NoSuchCommand();
		}

		return command;
	}
}