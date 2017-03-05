package com.example.sample.impl;

import java.util.ArrayList;

import com.example.sample.dao.GenenricsDao;
import com.example.sample.dao.GenenricsDaoImpl;
import com.example.sample.model.Teacher;

public class TeacherImpl {
	
	public static void main(String[] args) {
		
		GenenricsDao<Teacher> teacherDao = new GenenricsDaoImpl<Teacher>();
		
		ArrayList<Teacher> teacherList = teacherDao.findAll();
		
		for(Teacher teacher : teacherList) {
			System.out.println(teacher);
		}
		
	}

}
