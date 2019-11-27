package Hexelet.Course_1_Lecture_09_Inner_static_and_nested_nonstatic_classes;

import java.util.Iterator;

public class Main {

	private static int [] integers = {1, 2, 5};
	
	public static void main(String[] args) {
			
		Building building = new Building();
		Human max = new Human ("Max");
		Human slava = new Human ("Slava");
		building.addHuman(max);
		building.addHuman(slava);
		
		for (Human human : building)
//		for (int i = 0; i < building.getSize(); i++)
		{
			System.out.println("In buliding: " + human);
//			System.out.println("In buliding: " + building.get(i));
		}
		
		Iterator<Human> iterator = building.iterator();
//		System.out.println(iterator.hasNext());
//		System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//		while (iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//			
//		}
		
//		for (int element :integers)
//		{
//		System.out.println(element);
//		}
//		
//		Human human = new Human ("Max", 1000);
//		IAccount deposite = null;
//		deposite = human.getNewAccount();
////		deposite = human.new HumanAccount();
//		IAccount pension = human.getNewAccount();
////		IAccount pension = human.new HumanAccount();
//		
//	System.out.println(human.getName() + "money: " + human.getMoney());
//	deposite.changeSum(10);
//	System.out.println(human.getName() + "money: " + human.getMoney());
//	pension.changeSum(5);
//	System.out.println(human.getName() + "money: " + human.getMoney());
	
	
	}
}


