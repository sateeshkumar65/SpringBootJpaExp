package com.example.jdbc.SpringBootJdbcExp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="EmpInfo_JPA")
public class StudentInfo {
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	@NotBlank(message="Student Name is Required")
	@Size(max = 10, min = 6)
	private String name;
	
	@NotNull(message="Student Age is required")
	@Max(value = 100,message = "Student Age must not be greater than 4 digits")
	@Min(value = 1,message="Student Age must be greater than 2 digits")
	private int age;
	
	@NotNull(message="please provide email")
	@Email(message="Please validate email")
	private String email;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
	
	
	
	

}
