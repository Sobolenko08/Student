package edu.examples.student.logic;

import edu.examples.student.entity.Student;
import java.util.List;

public interface StudentLogic {
	boolean addStudent(String name);

	boolean updateStudent(int id, String name);

	List<Student> getAllStudents();
}