package org.avs.hibernatedemo.app;

import java.util.ArrayList;
import java.util.List;

import org.avs.hibernatedemo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GettingDataFromDb {
	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			System.out.println("getting all the data");
			session.beginTransaction();
			List<Student> studentList = new ArrayList<>();
			studentList = session.createQuery("from Student s").getResultList();
			check(studentList);
			System.out.println("getting all data finished");
			studentList = session.createQuery("from Student s where"+" s.firtstName LIKE 'Srini%'").getResultList();
			check(studentList);
			int count = session.createQuery("from Student s where s.age=23").getFetchSize();
			System.out.println("Like finished");
			System.out.println(count);
			session.getTransaction().commit();
		} catch (Exception exception) {
			System.out.println("failed..");
		} finally {
			session.close();
			sessionFactory.close();
		}
	}

	/**
	 * @param studentList
	 */
	private static void check(List<Student> studentList) {
		studentList.forEach(action -> System.out.println(action));
	}

}
