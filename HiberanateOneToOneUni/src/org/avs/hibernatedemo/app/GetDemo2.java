package org.avs.hibernatedemo.app;

import org.avs.hibernatedemo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetDemo2 {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		/**get session from session factory*/
		Session session = sessionFactory.getCurrentSession();
		try{
//			Student student = new Student("Srinivasan","Seethraman","srinivasangenious@gmail.com","srinseet","bala@1994","AU6201",23);
			/**begining Transation */
			System.out.println("getting lastname");
			session.beginTransaction();
			
			/**saving the object**/
			Student student =	session.get(Student.class,5);
			System.out.println("old name:"+student.getLastName());
			System.out.println("..........updating........");
			student.setLastName("srini1");
			session.getTransaction().commit();	
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("update Student  set age=24").executeUpdate();
			session.getTransaction().commit();
			System.out.println("updatedd successfully");
			System.out.println("new name"+student.getLastName());
		}catch(Exception ex){
			System.out.println("issue occured");
			ex.printStackTrace();
		}finally {
			session.close();
			sessionFactory.close();
		}
	}

}
