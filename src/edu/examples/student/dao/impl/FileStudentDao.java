package edu.examples.student.dao.impl;

import edu.examples.student.dao.StudentDao;
import edu.examples.student.entity.Student;
import edu.examples.student.util.GenerateId;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class FileStudentDao implements StudentDao {
    private final Map<Integer, Student> studentStorage = new HashMap<>();

    @Override
    public boolean saveStudent(Student student) {
        int id = GenerateId.generate();
        student.setId(id);
        studentStorage.put(id, student);
        System.out.println("Student added: " + student);
        return true;
    }

    @Override
    public boolean updateStudent(int id, String name) {
        Student student = studentStorage.get(id);
        if (student != null) {
            student.setName(name);
            System.out.println("Student updated: " + student);
            return true;
        }
        System.out.println("Student not found with id: " + id);
        return false;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentStorage.values().stream().collect(Collectors.toList());
    }
}