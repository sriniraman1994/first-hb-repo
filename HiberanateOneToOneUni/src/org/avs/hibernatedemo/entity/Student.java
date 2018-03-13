package org.avs.hibernatedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hbstudent")
public class Student {
@Override
	public String toString() {
		return "Student [id=" + id + ", firtstName=" + firtstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", courseCode=" + courseCode + ", age=" + age
				+ "]";
	}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private int id;
@Column(name="firstname")
private String firtstName;
@Column(name="lastname")
private String lastName;
@Column(name="email")
private String email;
@Column(name="username")
private String username;
@Column(name="password")
private String password;
@Column(name="coursecode")
private String courseCode;
@Column(name="age")
private int age;
public Student(){
	
}
public Student(String firtstName, String lastName, String email, String username, String password, String courseCode,
		int age) {
	super();
	this.firtstName = firtstName;
	this.lastName = lastName;
	this.email = email;
	this.username = username;
	this.password = password;
	this.courseCode = courseCode;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirtstName() {
	return firtstName;
}
public void setFirtstName(String firtstName) {
	this.firtstName = firtstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCourseCode() {
	return courseCode;
}
public void setCourseCode(String courseCode) {
	this.courseCode = courseCode;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
