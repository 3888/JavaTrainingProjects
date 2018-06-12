package hexeletUniversity.Course_2_Lecture_02_Singleton;

public class Main {
	
	public static void main (String [] args)
	{
		System.out.println("line 1");
//		Settings mySettings = Settings.getInstance();
//		mySettings.setGameName("game1");
		testSingleton();
		System.out.println("line 2");
			
}
	private static void testSingleton ()
	{
		System.out.println(Settings.getGameName());
		System.out.println(Settings.getInstance());
		
		
//			Thread t1 = new Thread(new Runnable() 
//			{				
//				@Override
//				public void run() {
//					int a = Settings.getInstance().getPlayersCount();	
////					Settings.getInstance();		
//					System.out.println(a);
//				}
//			});
//			
//			Thread t2 = new Thread(new Runnable() 
//			{				
//				@Override
//				public void run() {
//					int a = Settings.getInstance().getPlayersCount();	
////					Settings.getInstance();		
//					System.out.println(a);
//				}
//			});
//			
//			Thread t3 = new Thread(new Runnable() 
//			{				
//				@Override
//				public void run() {
//					int a = Settings.getInstance().getPlayersCount();	
////					Settings.getInstance();		
//					System.out.println(a);
//				}
//			});
//			
//			Thread t4 = new Thread(new Runnable() 
//			{				
//				@Override
//				public void run() {
//					int a = Settings.getInstance().getPlayersCount();	
////					Settings.getInstance();		
//					System.out.println(a);
//				}
//			});
//			
//			Thread t5 = new Thread(new Runnable() 
//			{				
//				@Override
//				public void run() {
//					int a = Settings.getInstance().getPlayersCount();	
////					Settings.getInstance();		
//					System.out.println(a);
//				}
//			});
//			
//			Thread t6 = new Thread(new Runnable() 
//			{				
//				@Override
//				public void run() {
//					int a = Settings.getInstance().getPlayersCount();	
////					Settings.getInstance();		
//					System.out.println(a);
//				}
//			});
			
			
//			for (int i = 0; ++i < 100;)
//			{
//				new Thread (new Runnable() 
//				{				
//					@Override
//					public void run() {
//						int a = Settings.getInstance().getPlayersCount();	
////						Settings.getInstance();		
//						if (a != -1)
//						System.out.println(a);
//						
//					}
//				}).start();
				
//				try
//				{	
//				Thread.sleep(100);
//				}
//				catch (InterruptedException e)
//				{
//					e.printStackTrace();
//				}
//			}
//			t1.start(); t2.start(); t3.start(); t4.start(); t5.start(); t6.start(); 
			
//		System.out.println(Settings.getInstance().getGameName());
	}
	
}
	

