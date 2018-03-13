package org.avs.hibernatedemo.app;

import org.avs.hibernatedemo.entity.Instructor;
import org.avs.hibernatedemo.entity.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
public static void main(String[] args) {
	SessionFactory sf = new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
	Instructor instructor = new Instructor("Dummy231", "demo", "dumdum@dummymail.com");
	InstructorDetails instructorDetails = new InstructorDetails("dummy", "dummyumm", "oop");
    instructor.setDetailsDemo(instructorDetails);
	try{
	Session session = sf.getCurrentSession();
	session.beginTransaction();
	session.save(instructor);
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
