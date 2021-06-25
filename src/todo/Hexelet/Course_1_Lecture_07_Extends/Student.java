package todo.Hexelet.Course_1_Lecture_07_Extends;

public class Student extends Human  {
//	private static final String N_A = "N/A";
	
	private int course = 1;
	
	public Student (String name){
		super(name);
		System.out.println("In Student()");       
	}
			public int getCourse() {
		return course;}
		
		public void setCourse(int course) {
		this.course = course;
		
			
			}}

	

