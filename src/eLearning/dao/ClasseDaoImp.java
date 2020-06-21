package eLearning.dao;

import java.util.List;

import javax.faces.context.FacesContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import eLearning.dao.Cours;



public class ClasseDaoImp implements ClasseDAO {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Classe.class).buildSessionFactory();
	Session session = factory.getCurrentSession();
	@Override
	public void add(Classe c) {
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}
	@Override
	public void delete(Long id) {
		session.beginTransaction();
		Classe cc = findById(id);
		session.delete(cc);
		session.getTransaction().commit();
		
	}
	@Override
	public Classe edit(Classe c) {
		session.beginTransaction();
		Classe cc = (Classe)session.merge(c);
		session.getTransaction().commit();
		return cc;
	}
	@Override
	public List<Classe> findAll() {
		session.beginTransaction();

		return session.createQuery("select o from Classe o ").list();

	}
	@Override
	public Classe findById(Long id) {
		return (Classe) session.get(Classe.class , id);
	}
	
	
	
}