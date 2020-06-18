package eLearning.Test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import eLearning.dao.CoursDAO;
import eLearning.dao.CoursDaoImp;
import eLearning.dao.Cours;

public class TestHibernate {

	public static void main(String[] args) {
		
			/*SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cours.class).buildSessionFactory();
			Session session = factory.getCurrentSession();*/
			Session session = HibernateUtil.openSession();
			
			
			try {
	
			
				CoursDAO dao= new CoursDaoImp();
				System.out.println("Done1");
				Cours c = new Cours();
				c.setNom_cours("DW");
				System.out.println("Done2");
				dao.add(c);
				System.out.println("Done");

				

				
			} finally {
			}
			
	}

}




