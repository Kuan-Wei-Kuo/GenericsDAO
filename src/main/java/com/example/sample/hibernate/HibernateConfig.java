package com.example.sample.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	
	private static SessionFactory sessionFactory;
	
	static {
		try {
			Configuration configuration = new Configuration();
	        configuration.configure();
	        
	        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder();
	        standardServiceRegistryBuilder.applySettings(configuration.getProperties());
	        
	        sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void shutdown() {
        getSessionFactory().close();
    }
}
