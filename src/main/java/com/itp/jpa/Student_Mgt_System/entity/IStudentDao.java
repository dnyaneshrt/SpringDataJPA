package com.itp.jpa.Student_Mgt_System.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IStudentDao extends JpaRepository<Student, Long>{

}

//public interface IStudentDao extends CrudRepository<Student, Long>{
//
//}
