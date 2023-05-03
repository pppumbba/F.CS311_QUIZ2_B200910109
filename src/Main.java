
public class Main {

	public static void main(String[] args) {

		Course course = new Course("Software Construction");
		course.setCourseName("Software Construction");
		
		System.out.print(course.getCourseName());
		System.out.print(course.getCourseName());
		
		course.setCourseName("Программ хангамжийн бүтээлт");
		System.out.print(course.getCourseName());
	}

}
