package com.example.sample.dao;

import java.awt.List;
import java.util.ArrayList;

public class GenenricsDaoImpl<T> implements GenenricsDao<T>{

	private T entity;
	
	public T getEntity() {
		return entity;
	}
	
	public ArrayList<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findById(T id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(T id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateById(T id) {
		// TODO Auto-generated method stub
		
	}

}
