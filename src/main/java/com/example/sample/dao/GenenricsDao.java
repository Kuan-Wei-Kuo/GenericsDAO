package com.example.sample.dao;

import java.util.ArrayList;

public interface GenenricsDao<T> {
	
	public ArrayList<T> findAll();
	
	public T findById(T id);
	
	public void deleteById(T id);

	public void updateById(T id);	
	
}
