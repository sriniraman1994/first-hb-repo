package org.avs.hibernatedemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Title")
	private String title;
	@ManyToOne(cascade={CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="instructor_fk_id")
	private Instructor instuctorFk;
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", instuctorFk=" + instuctorFk + "]";
	}
	public Course() {
		super();
	}
	public Course(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Instructor getInstuctorFk() {
		return instuctorFk;
	}
	public void setInstuctorFk(Instructor instuctorFk) {
		this.instuctorFk = instuctorFk;
	}
	
	

}
