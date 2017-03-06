package com.example.sample.dao;

import java.awt.List;
import java.util.ArrayList;

import org.hibernate.Session;

import com.example.sample.hibernate.HibernateConfig;

public class GenenricsDaoImpl<T> implements GenenricsDao<T>{

	private T entity;
	
	private Session session;
	
	public GenenricsDaoImpl() {
		session = HibernateConfig.getSessionFactory().openSession();
	}
	
	public T getEntity() {
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<T> findAll() {
		
		session.beginTransaction();
		
		ArrayList<T> resultList = (ArrayList<T>) session.createQuery("from Student").list();
		
		for(T t : resultList) {
			System.out.println(t);
		}
		
		return resultList;
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
