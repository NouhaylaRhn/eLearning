package eLearning.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



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
	@SuppressWarnings({ "null", "unchecked" })
	@Override
	public List<String> findAll() {
		session.beginTransaction();
		List<String> catégories = new ArrayList<String>();

		List<Classe> listclasse = session.createQuery("select o from Classe o ").list();
		System.out.println(listclasse);
		System.out.println("sm7li");
		for(Classe o : listclasse) {
			catégories.add(o.getNom_classe());
		}
		System.out.println(catégories);
		
		return catégories;

	}
	@Override
	public Classe findById(Long id) {
		return (Classe) session.get(Classe.class , id);
	}
	
	
	
}