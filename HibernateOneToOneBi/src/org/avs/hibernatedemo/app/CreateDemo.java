package org.avs.hibernatedemo.app;

import org.avs.hibernatedemo.entity.Instructor;
import org.avs.hibernatedemo.entity.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
public static void main(String[] args) {
	SessionFactory sf = new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
	InstructorDetails instructorDetails = new InstructorDetails("Rabada", "Kagiso@SA", "SAwhitewash");
	Instructor instructor = new Instructor("Rabada", "Kagiso", "ABD@SAC.com");
	instructor.setDetailsDemo(instructorDetails);
	instructorDetails.setInstructor(instructor);
	try{
	Session session = sf.getCurrentSession();
	session.beginTransaction();
	session.save(instructorDetails);
	System.out.println("saving "+instructor);
	session.getTransaction().commit();
}catch(Exception ex){
System.out.println("issue occured");
	ex.printStackTrace();
}finally {
	sf.close();
}
	
	
	
	
	
}
}
