package com.rk.dao;

import java.util.List;
import java.util.Map;

import com.rk.model.Student;

public interface IStudentDao {

	void createTable();
	void dropTable();
	int insertRecord(int sid, String sname, Double smarks);
	int updateRecord(int sid, String sname, Double smarks);
	Map fetchAsMapObject(int sid);
	List<Student> fetchAll();
	Student fetchAsObject(int sid); 
	List<Student> fetchAllAsObject();
}
