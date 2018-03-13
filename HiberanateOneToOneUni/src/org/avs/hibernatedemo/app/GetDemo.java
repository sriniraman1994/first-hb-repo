package org.avs.hibernatedemo.app;

import org.avs.hibernatedemo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetDemo {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		/**get session from session factory*/
		Session session = sessionFactory.getCurrentSession();
		try{
//			Student student = new Student("Srinivasan","Seethraman","srinivasangenious@gmail.com","srinseet","bala@1994","AU6201",23);
			/**begining Transation */
			session.beginTransaction();
			System.out.println("Saving..........");
			/**saving the object**/
			Student student =	session.get(Student.class,5);
			System.out.println(student.getFirtstName()+","+student.getLastName());
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
