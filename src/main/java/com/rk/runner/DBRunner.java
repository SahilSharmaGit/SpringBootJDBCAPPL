package com.rk.runner;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rk.dao.IStudentDao;
import com.rk.model.Student;

@Component
public class DBRunner implements CommandLineRunner {

	@Autowired
	private IStudentDao dao;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// dao.createTable();
		// System.out.println("Table Created!!!");

		// dao.dropTable();
		// System.out.println("Table Droppded!!!");

		/*
		 * if(dao.insertRecord(1,"Sahil", 412.4) != 0 ) {
		 * System.out.println("Data Inserted"); }
		 */

		/*
		 * Map mapData = dao.fetchAsMapObject(1); System.out.println(mapData);
		 */

		/*
		 * Student std = dao.fetchAsObject(1); System.out.println(std);
		 */

		/*
		 * List<Student> listData = dao.fetchAllAsObject(); for (Student student :
		 * listData) { System.out.println(student); }
		 */

		/* getting error here:
		 * List l = dao.fetchAll(); System.out.println(l);
		 */

		/*if(dao.updateRecord(1, "Shyam", 300.5)!=0)
		{
			System.out.println("Data Updated!!!");
		}*/
	}
}
