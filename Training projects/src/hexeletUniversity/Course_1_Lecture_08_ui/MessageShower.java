package hexeletUniversity.Course_1_Lecture_08_ui;


public abstract class MessageShower { 
	
	private final IOnStringInput onStringInput;  
	
	private final String message;
	
	
	public MessageShower(IOnStringInput onStringInput, String message){
		this.onStringInput = onStringInput;
		this.message = message;
	}
	
	
//	public void showStars(){
	//	System.out.println ("********");
		//show();
		//System.out.println ("****  ****");
	public String getMessage() {
		return message;
	}
	public IOnStringInput getOnStringInput(){
		return onStringInput;
	}
	
		public abstract void show();{
		}
		} 
		//System.out.println (message);
		
		//public String getMessage() {
			//return message;
		
	