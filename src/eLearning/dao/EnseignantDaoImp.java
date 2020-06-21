package eLearning.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import eLearning.dao.Entity.Enseignant;


public class EnseignantDaoImp implements EnseignantDAO {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Classe.class).buildSessionFactory();
	Session session = factory.getCurrentSession();
	
	
	public List<Enseignant> GetEnseignants()  throws Exception {
		session.beginTransaction();
		   return session.createQuery("SELECT a FROM Enseignant a", Enseignant.class).getResultList();      	
	}
	
}
