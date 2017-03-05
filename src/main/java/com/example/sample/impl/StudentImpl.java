package com.example.sample.impl;

import java.util.ArrayList;

import com.example.sample.dao.GenenricsDao;
import com.example.sample.dao.GenenricsDaoImpl;
import com.example.sample.model.Student;

public class StudentImpl {

	public static void main(String[] args) {
		
		GenenricsDao<Student> studentDao = new GenenricsDaoImpl<Student>();
		
		ArrayList<Student> studentList = studentDao.findAll();
		
		for(Student student : studentList) {
			System.out.println(student);
		}
		
	}
	
}
