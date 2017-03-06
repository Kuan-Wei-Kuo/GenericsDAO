package com.example.sample.dao;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.example.sample.hibernate.HibernateConfig;

public class GenenricsDaoImpl<T> implements GenenricsDao<T>{

	private T entity;
	
	private Session session;
	
	public GenenricsDaoImpl(T entity) {
		session = HibernateConfig.getSessionFactory().openSession();
		
		this.entity = entity;
	}
	
	public T getEntity() {
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<T> findAll() {
		
		ArrayList<T> resultList = (ArrayList<T>) session.createQuery("from " + entity.getClass().getName()).list();
		
		HibernateConfig.shutdown();
		
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
