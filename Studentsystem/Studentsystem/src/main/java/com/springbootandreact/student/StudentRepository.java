package com.springbootandreact.student;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootandreact.repository.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
