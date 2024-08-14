package edu.examples.student.controller;

//import edu.examples.student.controller.impl.AddStudentCommand;
//import edu.examples.student.controller.impl.UpdateStudentCommand;

public class Controller {
	private final CommandProvider provider = new CommandProvider();

	public void executeTask(String request) {
		String commandName = request.split(" ")[0];
		Command command = provider.getCommand(commandName);
		command.execute(request);
	}
}