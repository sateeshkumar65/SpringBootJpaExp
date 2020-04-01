package com.example.jdbc.SpringBootJdbcExp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.jdbc.SpringBootJdbcExp.model.EmpInfo;
import com.example.jdbc.SpringBootJdbcExp.repository.EmpInfoRepository;

@Repository
public class EmpDao {
	
	@Autowired
	private EmpInfoRepository empInfoRepository;
	
	public EmpInfo createEmp(EmpInfo empInfo) {
		return empInfoRepository.save(empInfo);
	}
	
	public Optional<EmpInfo> getEmpInfoByid(int id) {
		return empInfoRepository.findById(id);
	}
	
	public List<EmpInfo> getAlLEmployeeInfo() {
		return (List<EmpInfo>) empInfoRepository.findAll();
	}
	
	public EmpInfo updateEmpById(EmpInfo empInfo, int id) {
		empInfo.setEmpID(id);
		return empInfoRepository.save(empInfo);
	}
	
	

}
