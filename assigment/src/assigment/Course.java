package assigment;

public class Course {
	String courseName;
	String courseTime;
	String courseTeacher;
	String courseFee;
	double coursePercent;
	public Course() {}
	
	public Course(String courseName, String courseTime,	String courseTeacher,String courseFee, double coursePercent) {
		this.courseName = courseName;
		this.courseTime = courseTime;
		this.courseTeacher = courseTeacher;
		this.courseFee = courseFee;
		this.coursePercent = coursePercent;
	}
}
