package com.example.jdbc.SpringBootJdbcExp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.jdbc.SpringBootJdbcExp.model.EmpInfo;

public interface EmpInfoRepository extends CrudRepository<EmpInfo, Integer>{

}
