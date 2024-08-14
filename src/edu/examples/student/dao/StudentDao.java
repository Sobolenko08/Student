package edu.examples.student.dao;

import edu.examples.student.entity.Student;
import java.util.List;

public interface StudentDao {
	boolean saveStudent(Student student);

	boolean updateStudent(int id, String name);

	List<Student> getAllStudents();
}