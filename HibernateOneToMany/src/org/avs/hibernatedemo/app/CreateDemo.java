package org.avs.hibernatedemo.app;

import java.util.Arrays;
import java.util.List;

import org.avs.hibernatedemo.entity.Course;
import org.avs.hibernatedemo.entity.Instructor;
import org.avs.hibernatedemo.entity.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {
public static void main(String[] args) {
	SessionFactory sf = new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetails.class).addAnnotatedClass(Course.class).buildSessionFactory();
	Course course1 = new Course("how to Become an Engineer");
	Course course2 =new Course("java-the life of software");
	Course course3 = new Course("Hibernate for all");
	List<Course>courseList = Arrays.asList(course1,course2,course3);
	try{
	Session session = sf.getCurrentSession();
	session.beginTransaction();
	Instructor instructor = session.get(Instructor.class, 1);
	instructor.setCourseList(courseList);
	course1.setInstuctorFk(instructor);
	course2.setInstuctorFk(instructor);
	course3.setInstuctorFk(instructor);
	session.save(course1);
	session.save(course2);
	session.save(course3);
	
	System.out.println("saving "+courseList);
	session.getTransaction().commit();
}catch(Exception ex){
System.out.println("issue occured");
	ex.printStackTrace();
}finally {
	sf.close();
}
	
	
	
	
	
}
}
