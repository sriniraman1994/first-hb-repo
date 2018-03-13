package org.avs.hibernatedemo.app;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.avs.hibernatedemo.entity.Instructor;
import org.avs.hibernatedemo.entity.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
		Session session = sf.getCurrentSession();
		int uid=1;
		try{
			System.out.println("deleting");
			session.beginTransaction();
			List<InstructorDetails> checkList = session.createQuery("from InstructorDetails id where "+" id.course='Rabada'").getResultList();
			Optional<Integer> id = checkList.stream().map(InstructorDetails::getId).findFirst();
			if(id.isPresent()){
				System.out.println(id.get());
					   InstructorDetails ins = session.get(InstructorDetails.class,id.get());
					   ins.getInstructor().setDetailsDemo(null);
						session.delete(ins);
			
			}
			
//			session.createQuery("delete from Instructor i where "+"i.firstName='Dummy231'").executeUpdate();
//		List<Instructor> getList = 	session.createQuery(" from Instructor i where"+" i.firstName='Dummy231'").getResultList();
//		int ins =getList.get(0).getId();
//		System.out.println(ins);
//		Instructor instructor1 = session.get(Instructor.class,ins);
//		session.delete(instructor1);
		session.getTransaction().commit();
			System.out.println("deleted");

		}catch(Exception ex){
			System.out.println("issue occured");
			ex.printStackTrace();
		}finally {
			session.close();
			sf.close();
		}
	}

}
