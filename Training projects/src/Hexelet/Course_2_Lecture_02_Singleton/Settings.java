package Hexelet.Course_2_Lecture_02_Singleton;

public class Settings {
	
//	private static final Settings INSTANCE = new Settings (); 
	
	
		
//	private String gameName;
	private static final String GAME_NAME = "TicTacToe";
	
//	private static Settings INSTANCE = null; 
	
	private int playersCount;
	
	public static Settings getInstance ()
	{
		return Settings.SettingsInstanceHolder.INSTANCE;
		
				
		
//		if (INSTANCE == null)
//		{
//			synchronized (Settings.class)
//			{
//				if (INSTANCE == null)
//					INSTANCE = new Settings();
//			}
//			
//		}
//		return Settings.INSTANCE;
	}
		
	public static String getGameName()
	{
		return GAME_NAME;		
	}
//	public String getGameName() {
//		return gameName;
//	}

//	public void setGameName(String gameName) {
//		this.gameName = gameName;
//	}
	  
	private Settings ()
	{
//		try
//		{	
//		Thread.sleep(500);
//		}
//		catch (InterruptedException e)
//		{
//			e.printStackTrace();
//		}
	System.out.println("In Settings()");
	playersCount = - 1;
		}
	
	public int getPlayersCount ()
	{
		return playersCount;
	}
	
	public static class SettingsInstanceHolder {
		private static Settings INSTANCE = new Settings (); 
		
		private SettingsInstanceHolder ()
		{
			
		}

	}
}
