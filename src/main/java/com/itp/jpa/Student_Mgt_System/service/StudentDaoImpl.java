package com.itp.jpa.Student_Mgt_System.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.jpa.Student_Mgt_System.entity.IStudentDao;
import com.itp.jpa.Student_Mgt_System.entity.Student;

@Service
public class StudentDaoImpl implements IStudentService{

	@Autowired
	IStudentDao iStudentDao;

	@Override
	public List<Student> getAllStudents() {
		return iStudentDao.findAll();
	}

	@Override
	public Student createStudent(Student student) {
		List<Student> list=iStudentDao.findAll();
	
		 list.stream()
//	    .filter(s->s.getsId())
	    .collect(Collectors.toList()).forEach(System.out::print);
		
		return iStudentDao.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return iStudentDao.save(student);
	}

	@Override
	public Student findById(Long id) {
		
		return iStudentDao.findById(id).get();
	}
	
	
}
