package edu.examples.student.logic.ipl;

import edu.examples.student.logic.StudentLogic;
import edu.examples.student.dao.DaoProvider;
import edu.examples.student.dao.StudentDao;
import edu.examples.student.entity.Student;

import java.util.List;

public class StudentLogicImpl implements StudentLogic {
	private final StudentDao studentDao = DaoProvider.getInstance().getStudentDao();

	@Override
	public boolean addStudent(String name) {
		Student student = new Student(0, name); // ID будет установлен в DAO
		return studentDao.saveStudent(student);
	}

	@Override
	public boolean updateStudent(int id, String name) {
		return studentDao.updateStudent(id, name);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
}