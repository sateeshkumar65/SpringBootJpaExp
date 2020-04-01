package com.example.jdbc.SpringBootJdbcExp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jdbc.SpringBootJdbcExp.dao.EmpDao;
import com.example.jdbc.SpringBootJdbcExp.model.EmpInfo;

@RestController
public class EmpController {
	
	@Autowired
	private EmpDao empDao;
	
	@PostMapping("/empInfo")
	public EmpInfo addEmployee(@RequestBody EmpInfo empInfo) {
		return empDao.createEmp(empInfo);
	}
	
	
	@GetMapping("/empInfo/{Id}")
	public Optional<EmpInfo> getEmpInfoById(@PathVariable("Id") int id) {
		return empDao.getEmpInfoByid(id);
	}
	
	@GetMapping("/empInfo")
	public List<EmpInfo> getAllEmployeeInfo() {
		return empDao.getAlLEmployeeInfo();
	}
	
	@PutMapping("/empInfo/{Id}")
	public EmpInfo updateEmpById(@RequestBody EmpInfo empInfo, @PathVariable("Id") int id) {
		return empDao.updateEmpById(empInfo, id);
	}

}
