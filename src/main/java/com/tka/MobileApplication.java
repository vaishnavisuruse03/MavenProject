package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MobileApplication{

public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Mobile1.class);
    SessionFactory sessionFactory=cfg.buildSessionFactory();
	System.out.println(4);
	Session session= sessionFactory.openSession();
	Mobile1 ss=new Mobile1(1,"Samsung",59000);
	session.save(ss);
	session.beginTransaction().commit();
  }
}
