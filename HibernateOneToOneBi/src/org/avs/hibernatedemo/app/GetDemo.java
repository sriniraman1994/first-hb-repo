package org.avs.hibernatedemo.app;

import java.util.List;
import java.util.stream.Collectors;

import org.avs.hibernatedemo.entity.Instructor;
import org.avs.hibernatedemo.entity.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetDemo {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
		Session session = sf.getCurrentSession();
		try {
			session.beginTransaction();
			List<InstructorDetails> resultList = session
					.createQuery("from InstructorDetails id " + " where id.course='dummy'").getResultList();
			List<Instructor> kList = resultList.stream().map(predicate -> predicate.getInstructor())
					.collect(Collectors.toList());
			session.getTransaction().commit();
			if (!kList.isEmpty()) {
				System.out.println(kList.get(0).getFirstName());
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
