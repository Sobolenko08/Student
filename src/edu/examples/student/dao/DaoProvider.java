package edu.examples.student.dao;

import edu.examples.student.dao.impl.FileStudentDao;

public class DaoProvider {
	private static final DaoProvider instance = new DaoProvider();

	private final StudentDao studentDao = new FileStudentDao();

	private DaoProvider() {
	}

	public static DaoProvider getInstance() {
		return instance;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}
}