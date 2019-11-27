package Hexelet.Course_1_Lecture_10_Exception;


import Hexelet.Course_1_Lecture_10_exceptions.IllegalHumanNameException;
import Hexelet.Course_1_Lecture_10_exceptions.IllegalMoneyException;

public class Human {

	private static final int MIN_NAME_LENGTH = 2;

	private static final int MIN_MONEY_VALUE = 0;

	private static final int MAX_MONEY_VALUE = Integer.MAX_VALUE / 2;
	
	private String name;
	
	private int money;
	
	public static Human createInstance (String name) throws IllegalHumanNameException {
		
		if(name == null || name.length() < MIN_NAME_LENGTH  ){
			throw new IllegalHumanNameException(name);
			
		}
	
		return new Human(name);
	}
	
	public static Human createInstance (String name, int money) throws IllegalHumanNameException, IllegalMoneyException{
		
		if( name == null  || name.length() < MIN_NAME_LENGTH ){
			throw new IllegalHumanNameException(name);
			
		}
		if (money < MIN_MONEY_VALUE || money > MAX_MONEY_VALUE){
			throw new IllegalMoneyException();
		
		}
		return new Human(name);
		
	}
	
	
	private Human(String name, int money) {
		
		this.name = name;
		this.money = money;
	}
	

	private Human(String name){
		this(name, 0);
	}

	public String getName() {
		return name;
		}

		
	public int getMoney() {
		return money;
		}
	
	

	private void setName(String name) {
		if(name != null)
		this.name = name;
	}


	@Override
	public String toString() {
		
		return getName();
		
	}
	public Account getNewAccount(){
		return new HumanAccount();
		
	}
	private class HumanAccount implements Account {

		@Override
		public int getSum() {
		
			return money;
		}

		@Override
		public void changeSum(int delta) {
			money += delta;}
	}
}
	 		


	

	 
	
