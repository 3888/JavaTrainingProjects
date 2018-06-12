package hexeletUniversity.Course_1_Lecture_07_Extends;

public class Main {
public static void main(String [] args){
	Human human = new Human ("Max");
	System.out.println(human.getName());
	System.out.println("~~~~~~~~~~~~~~~~");
	Student student = new Student("Slava");
	System.out.println(student.getName());
	System.out.println("~~~~~~~~~~~~~~~~");
	House house = new House ();
	Human houseOwner = student;
	house.setHuman(houseOwner);
	System.out.println("Owner name: " + house.getOwnerName()) ;
	
}
}
