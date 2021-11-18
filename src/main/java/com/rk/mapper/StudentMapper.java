package com.rk.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.rk.model.Student;
@Component
public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s = new Student();
		s.setSid(rs.getInt(1));
		s.setSname(rs.getString(2));
		s.setSmarks(rs.getDouble(3));
		return s;
	}
}
