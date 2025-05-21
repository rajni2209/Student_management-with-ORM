package com.spring.orm_project.Dao;

import java.util.List;

import com.spring.orm_project.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public Student getData(int id);
	public List<Student> getAllData();
	public void update(Student student , int id);
	public void delete(int id);	
}
