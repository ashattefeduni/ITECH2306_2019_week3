package lecture3;

public class CourseRunner {
	
	
	
	public static void main(String[] args) {
		Course javaCourse = new Course("Java", 7, 100.0);
		
		System.out.println(javaCourse.getNumberOfCoursesCreated());
		
		for (int i = 0; i < 10; i++) {
			new Course("Course"+i, i, 100.0 * i);
		}
		
		Course webCourse = new Course("Web Design", 7, 150.0);
		
		System.out.println(webCourse.getNumberOfCoursesCreated());
		
		
		
		
		System.out.println("Java Course Name: " + javaCourse.getName());
		System.out.println("Java Course # created: " + Course.getNumberOfCoursesCreated());
		
		System.out.println("Web Course Name: " + webCourse.getName());
		System.out.println("Web Course # created: " + Course.getNumberOfCoursesCreated());
		
		
		System.out.println("Courses created: " + Course.getNumberOfCoursesCreated());
		
	
	
	}
	

}
