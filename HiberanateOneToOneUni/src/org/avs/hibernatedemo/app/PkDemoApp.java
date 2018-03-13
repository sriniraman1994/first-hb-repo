package org.avs.hibernatedemo.app;

import org.avs.hibernatedemo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PkDemoApp {
	public static void main(String[] args) {
		/** SessionFactory is used to generate Session*/
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		/**get session from session factory*/
		Session session = sessionFactory.getCurrentSession();
		try{
//			Student student = new Student("Srinivasan","Seethraman","srinivasangenious@gmail.com","srinseet","bala@1994","AU6201",23);
//			Student student1 = new Student("balaji","march","srinivasanmarch94@gmail.com","balamarc","bala@1994","AU6201",23);
//			Student student2 = new Student("bala","maha","balamaha4@gmail.com","balamaha","bala@1994","AU6201",23);
			Student student2 = new Student("balamah","maha","balamah4@gmail.com","balamaha","bala@1994","AU6201",23);

			/**begining Transation */
			session.beginTransaction();
			System.out.println("Saving..........");
			/**saving the object**/
			session.save(student2);
			session.getTransaction().commit();	
			System.out.println("saved successfully");
		}catch(Exception ex){
			System.out.println("issue occured");
			ex.printStackTrace();
		}finally {
			session.close();
			sessionFactory.close();
		}
		
		
	}
}
