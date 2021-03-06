package org.avs.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor_details")
public class InstructorDetails{
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="id")
   private	int id;
   @Column(name="course")
   private String course;
   @Column(name="youtube_channel")
   private String youtubeChannel;
   @Column(name="coupon") 
   private String coupon;
public InstructorDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getYoutubeChannel() {
	return youtubeChannel;
}
public void setYoutubeChannel(String youtubeChannel) {
	this.youtubeChannel = youtubeChannel;
}
public String getCoupon() {
	return coupon;
}
public void setCoupon(String coupon) {
	this.coupon = coupon;
}
public InstructorDetails( String course, String youtubeChannel, String coupon) {
	this.course = course;
	this.youtubeChannel = youtubeChannel;
	this.coupon = coupon;
}
@Override
public String toString() {
	return "InstructorDetails [id=" + id + ", course=" + course + ", youtubeChannel=" + youtubeChannel + ", coupon="
			+ coupon + "]";
}

	
	
	
}
