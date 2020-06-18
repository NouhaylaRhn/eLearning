package eLearning.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.Session;

public class Test {
	static Session session = HibernateUtil.openSession();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcURL="jdbc:mysql://localhost:3306/elearning?useSSL=false&serverTimezone=UTC";
		String user ="projet";
		String pass="projet";
		
		try {
			System.out.println("Connection to database : " +jdbcURL);
			Connection myconn = DriverManager.getConnection(jdbcURL,user,pass);
			System.out.println("Connection succcesffly");
			session.createQuery("select o from Cours o ").list();
		} catch (SQLException e) {
			
			System.out.println("Connection noot succcesffly");

			e.printStackTrace();
		}
	}

}
