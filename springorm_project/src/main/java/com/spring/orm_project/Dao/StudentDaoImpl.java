package com.spring.orm_project.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm_project.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int insert(Student student) {
		int r = (int) this.hibernateTemplate.save(student);
		return r;
	}

	@Override
	public Student getData(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;
	}

	@Override
	public List<Student> getAllData() {
		List<Student> student = this.hibernateTemplate.loadAll(Student.class);
		return student;
	}

	@Override
	@Transactional
	public void update(Student student , int id) {
		this.hibernateTemplate.update(student);
		
	}


	@Override
	@Transactional
	public void delete(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
        if (student != null) {
            this.hibernateTemplate.delete(student);
        }
		
	}
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	
	
}
