package com.example.jdbc.SpringBootJdbcExp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.jdbc.SpringBootJdbcExp.model.StudentInfo;

public interface StudentInfoRepository extends CrudRepository<StudentInfo, Integer> {
	
	public StudentInfo findByAgeLessThan(int age);
	
	public List<StudentInfo> findByAgeGreaterThan (int age);
	
	public StudentInfo findByName(String name);
	
	public List<StudentInfo> findByEmail(String email);
	
	public StudentInfo findById(int id);
	
	@Query(value="select * from emp_info_jpa where name=:name and age=:age",nativeQuery = true)
	public StudentInfo findByNameAndAge(String name, int age);
	
	public List<StudentInfo> findByAgeBetween(int age1,int age2);
	
	public StudentInfo findByAgeEquals(int age);

}
