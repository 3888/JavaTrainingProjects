package Hexelet.Course_1_Lecture_09_Inner_static_and_nested_nonstatic_classes;


public class Human {
	
	

	private String name;
	
	private int money;
	
	public Human (String name, int money)
		{
		this.name = name;
		this.money = money;
	}

	public Human (String name)
	{
	this(name, 0);
	
}
	public String getName() {
		return name;
	}
	
	
	public int getMoney() {
		return money;
	}

	
	@Override
	public String toString() {
		return getName();
	}
	public IAccount getNewAccount()
	{
		return new HumanAccount();
	}
	
	private class HumanAccount implements IAccount
	{
		@Override
	public int getSum() {
		// TODO Auto-generated method stub
		return money;
	}

	@Override
	public void changeSum(int delta) {
		// TODO Auto-generated method stub
		money += delta;
	}

//void changeMoney (int delta)
//{
//	this.money += delta;
//}
	
	
}
}
	

