package com.lti.bean;

public class Course {
	private int courseId;
	private String courseName;
	private String courseDescription;

	public Course() {

	}


	public Course(int courseId, String courseName, String courseDescription) {

		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
	}

	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



}
