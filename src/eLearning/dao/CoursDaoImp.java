package eLearning.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import eLearning.dao.Cours;



public class CoursDaoImp implements CoursDAO {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cours.class).buildSessionFactory();
	Session session = factory.getCurrentSession();

	@Override
	public void add(Cours c) {
		session.beginTransaction();
		session.save(c);
		//Cours cc = (Cours)session.save(c);
		session.getTransaction().commit();
		
	}

	@Override
	public void delete(Long id) {
		session.beginTransaction();
		Cours cc = findById(id);
		session.delete(cc);
		session.getTransaction().commit();
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
		return (Cours) session.get(Cours.class , id);
	}
	
	

}
