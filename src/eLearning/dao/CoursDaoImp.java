package eLearning.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import eLearning.Test.HibernateUtil;



public class CoursDaoImp implements CoursDAO {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cours.class).buildSessionFactory();
	Session session = factory.getCurrentSession();

	@Override
	public void add(Cours c) {
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	    session.close();
	}

	@Override
	public void delete(Long id) {
		session.beginTransaction();
		Cours cc = findById(id);
		session.delete(cc);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public Cours edit(Cours c) {
		session.beginTransaction();
		Cours cc = (Cours)session.merge(c);
		session.getTransaction().commit();
		return cc;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cours> findAll() {
		session.beginTransaction();
		return session.createQuery("select o from Cours o ").list();
	}

	@Override
	public Cours findById(Long id) {
		Cours cours = (Cours) session.get(Cours.class , id);
		
		String contenu = cours.getContenu();
		
		System.out.println("cours:"+ contenu);
		return cours;
	}
	
	

	

}
