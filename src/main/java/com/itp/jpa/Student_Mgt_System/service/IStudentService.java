package com.itp.jpa.Student_Mgt_System.service;

import java.util.List;
import java.util.Optional;

import com.itp.jpa.Student_Mgt_System.entity.Student;

public interface IStudentService {

	List<Student> getAllStudents();

	Student createStudent(Student student);

	Student updateStudent(Student student);

	Student findById(Long id);
}
