package com.rk.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rk.dao.IStudentDao;
import com.rk.mapper.StudentMapper;
import com.rk.model.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

	private final static String CREATE_TABLE = "CREATE TABLE students(sid NUMBER, sname VARCHAR, smarks FLOAT)";
	private final static String DROP_TABLE = "DROP TABLE students";
	private final static String INSERT_RECORD = "INSERT INTO students VALUES(?,?,?)";
	private final static String UPDATE_RECORD = "UPDATE students SET sname = ?, smarks = ? where sid = ?";
	private final static String SELECT_SINGLE = "SELECT * FROM students where sid = ? ";
	private final static String SELECT_ALL = "SELECT * FROM students ";

	@Autowired
	private JdbcTemplate jt;
	@Autowired
	private StudentMapper sm;

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		jt.execute(CREATE_TABLE);
	}

	@Override
	public void dropTable() {
		// TODO Auto-generated method stub
		jt.execute(DROP_TABLE);
	}

	@Override
	public int insertRecord(int sid, String sname, Double smarks) {
		// TODO Auto-generated method stub
		return jt.update(INSERT_RECORD, sid, sname, smarks);
	}

	@Override
	public int updateRecord(int sid, String sname, Double smarks) {
		// TODO Auto-generated method stub
		return jt.update(UPDATE_RECORD, sid, sname, smarks);
	}

	@Override
	public Map fetchAsMapObject(int sid) {
		Map data = jt.queryForMap(SELECT_SINGLE, sid);
		return data;
	}

	@Override
	public List fetchAll() {
		List data = jt.queryForList(SELECT_ALL, sm);
		return data;
	}

	@Override
	public Student fetchAsObject(int sid) {
		// TODO Auto-generated method stub
		Student st = jt.queryForObject(SELECT_SINGLE, sm, sid);
		return st;
	}

	@Override
	public List<Student> fetchAllAsObject() {
		// TODO Auto-generated method stub
		List<Student> data =jt.query(SELECT_ALL, sm);
		return data;
	}
}
