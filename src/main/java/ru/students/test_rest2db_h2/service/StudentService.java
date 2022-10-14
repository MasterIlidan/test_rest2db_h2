package ru.students.test_rest2db_h2.service;

import ru.students.test_rest2db_h2.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
