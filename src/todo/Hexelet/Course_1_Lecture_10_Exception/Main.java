package todo.Hexelet.Course_1_Lecture_10_Exception;


import todo.Hexelet.Course_1_Lecture_10_exceptions.IllegalHumanNameException;
import todo.Hexelet.Course_1_Lecture_10_exceptions.IllegalMoneyException;

public class Main {

	private static int[] integers = { 1, 2, 5 };

	public static void main(String[] args) {

		String name = "Max";
//		int money = 14;

		name = null;
//		money -= 200;
//		try {
//			Human i1 = Human.createInstance(name);
//			System.out.println("Human name: " + i1.getName());
//		}
//		catch (IllegalHumanNameException e) {
//			System.out.println("Name ERROR!!!" + e.getMessage());
//		}
//		catch (NullPointerException e) {
//			System.out.println(" ERROR!!");
//		}
		try {
			name = "Max";
			Human i1 = Human.createInstance(name, -12);
			System.out.println("Human name: " + i1.getName());
		} catch (IllegalMoneyException | IllegalHumanNameException e) {
			System.out.println("Human creation ERROR!!!");
		}
		finally {
			System.out.println("Finnaly");
		}
		
		try {
			name = "Max";
			Human i1 = Human.createInstance(name, 12);
			System.out.println("Human name: " + i1.getName());
		} catch (IllegalMoneyException | IllegalHumanNameException e) {
			System.out.println("Human creation ERROR!!!");
		}
		finally {
			System.out.println("Finnaly");
		}
	
		try {
			name = null;
			name.length();
			Human i1 = Human.createInstance(name, -12);
			System.out.println("Human name: " + i1.getName());
		} catch (IllegalMoneyException | IllegalHumanNameException e) {
			System.out.println("Human creation ERROR!!!");
		}
		finally {
			System.out.println("Finnaly");
		}
		
		
	}
		}
	

