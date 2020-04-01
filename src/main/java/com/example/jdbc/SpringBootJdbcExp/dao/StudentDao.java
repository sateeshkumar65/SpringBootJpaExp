package com.example.jdbc.SpringBootJdbcExp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.jdbc.SpringBootJdbcExp.model.StudentInfo;
import com.example.jdbc.SpringBootJdbcExp.repository.StudentInfoRepository;

@Repository
public class StudentDao {
	
	@Autowired
	private StudentInfoRepository studentInfoRepository;
	
	public StudentInfo createStudent(StudentInfo studentInfo) {
		 return studentInfoRepository.save(studentInfo);
	}
	
	public StudentInfo findByStudentId(int id) {
		return studentInfoRepository.findById(id);
	}
	
	public List<StudentInfo> findByStudentEmail(String email) {
		return studentInfoRepository.findByEmail(email);
	}
	
	public StudentInfo findByAgeLessThan(int age) {
		return studentInfoRepository.findByAgeLessThan(age);
	}
	
	public List<StudentInfo> findByAgeGreaterThan(int age) {
		return studentInfoRepository.findByAgeGreaterThan(age);
	}
	
	public StudentInfo findByNameAndAge(String name, int age) {
		return studentInfoRepository.findByNameAndAge(name, age);
	}
	
	public List<StudentInfo> findByAgeBetween(int age1,int age2){
		return studentInfoRepository.findByAgeBetween(age1, age2);
	}
	
	public StudentInfo findByAgeEquals(int age) {
		return studentInfoRepository.findByAgeEquals(age);
	}
	
	public StudentInfo updateStudent(StudentInfo studentInfo,int id) {
		studentInfo.setId(id);
		return studentInfoRepository.save(studentInfo);
	}
	
	public void deleteEmployee(int id) {
		 studentInfoRepository.deleteById(id);
	}
	
	public List<StudentInfo> getAllStudents(){
		return (List<StudentInfo>)studentInfoRepository.findAll();
	}

}
