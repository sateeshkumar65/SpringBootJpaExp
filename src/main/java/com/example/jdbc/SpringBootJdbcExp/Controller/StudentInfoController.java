package com.example.jdbc.SpringBootJdbcExp.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jdbc.SpringBootJdbcExp.dao.StudentDao;
import com.example.jdbc.SpringBootJdbcExp.model.StudentInfo;
import com.example.jdbc.SpringBootJdbcExp.repository.StudentInfoRepository;

@RestController
public class StudentInfoController {
	
	@Autowired
	private StudentDao studentDao;
	
	@PostMapping("/studentInfo")
	public StudentInfo createStudent(@Valid @RequestBody StudentInfo studentInfo) {
		
		return studentDao.createStudent(studentInfo);
		
	}
	
	@GetMapping("/studentInfo/{Id}")
	public StudentInfo findByStudentId(@PathVariable("Id") int id) {
		return studentDao.findByStudentId(id);
	}
	
	@GetMapping("/studentInfo/getAll")
	public List<StudentInfo>  getAllStudents(){
		return studentDao.getAllStudents();
	}
	
	@GetMapping("/studentInfo/email/{email}")
	public List<StudentInfo> findByStudentEmail(@PathVariable("email") String email) {
		return studentDao.findByStudentEmail(email);
	}
	
	@GetMapping("/studentInfo/age/{age}")
	public StudentInfo findByAgeLessThan(@PathVariable("age") int age) {
		return studentDao.findByAgeLessThan(age);
	}
	
	@GetMapping("/studentInfo/age/greater/{age}")
	public List<StudentInfo> findByAgeGreaterThan(@PathVariable("age") int age){
		return studentDao.findByAgeGreaterThan(age);
	}
	
	
	
	@GetMapping("/studentInfo/name/{name}/age/{age}")
	public StudentInfo findByNameAndAge(@PathVariable("name")String name, @PathVariable("age") int age) {
		return studentDao.findByNameAndAge(name, age);
	}
	
	@GetMapping("/studentInfo/{age1}/{age2}")
	public List<StudentInfo> findByAgeBetwen(@PathVariable("age1")int age1, @PathVariable("age2")int age2){
		return studentDao.findByAgeBetween(age1, age2);
	}
	
	@GetMapping("/studentInfo/ageEquals/{age}")
	public StudentInfo findByAgeEquals(@PathVariable("age") int age) {
		return studentDao.findByAgeEquals(age);
	}
	
	@PutMapping("/studentInfo/update/{Id}")
	public StudentInfo updateStudent(@RequestBody StudentInfo studentInfo, @PathVariable("Id") int id) {
		return studentDao.updateStudent(studentInfo, id);
	}
	
	@DeleteMapping("/studentInfo/delete/{Id}")
	public void deleteEmployeeById(@PathVariable("Id") int id){
		studentDao.deleteEmployee(id);
	}
	

}
