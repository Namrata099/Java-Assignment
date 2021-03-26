package com.course;

public class Course {
	
	private String courseId;
	private String courseTitle;
	private String courseInstructor;
	
	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public static int getNoOfInstructors() {
		return noOfInstructors;
	}

	public static void setNoOfInstructors(int noOfInstructors) {
		Course.noOfInstructors = noOfInstructors;
	}

	public String getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	
	private static int noOfInstructors;
}
