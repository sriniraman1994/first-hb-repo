package org.avs.hibernatedemo.app;

import java.util.List;
import java.util.stream.Collectors;

import org.avs.hibernatedemo.entity.Course;
import org.avs.hibernatedemo.entity.Instructor;
import org.avs.hibernatedemo.entity.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetDemo {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = sf.getCurrentSession();
		try {
			session.beginTransaction();
			Instructor in = session.get(Instructor.class, 1);
			System.out.println("check"+in);
			System.out.println("ok"+in.getCourseList().get(0));
//			System.out.println(in.getCourseList().get(0).getTitle());
			session.getTransaction().commit();
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
