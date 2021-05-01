package assigment;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.courseName = "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)";
		course1.courseTime ="2 Ay";
		course1.courseTeacher = "Engin Demiroğ";
		course1.courseFee = "Ücretsiz";
		course1.coursePercent = 0;
		
		Course course2 = new Course();
		course2.courseName = "Programlamaya Giriş İçin Temel Kurs";
		course2.courseTime ="4 Ay";
		course2.courseTeacher = "Engin Demiroğ";
		course2.courseFee = "Ücretsiz";
		course2.coursePercent = 0;
		
		
		
		Course course3 = new Course("Java","2 Ay","Engin Demiroğ","Ücretsiz", 20);
		
		
		Course courses[] = {course1,course2,course3};
		for (Course course : courses) {
			System.out.println(course.courseName);			
			System.out.println(course.courseTime);
			System.out.println(course.courseTeacher);
			System.out.println(course.coursePercent);
			System.out.println(course.courseFee);
			System.out.println("");
		}
		
		CourseManager courseManager = new CourseManager();
		courseManager.adtoCourse(course3);
		
		Users user1 = new Users();
		user1.id = 1;
		user1.UserName = "Büşra Merve";
		user1.UserSurname = "Aydın";
		
		Users users[] = {user1};
		for (Users user : users) {
			System.out.println("isminiz: " + user.UserName + " " +user.UserSurname);
		}
		
	}

}
