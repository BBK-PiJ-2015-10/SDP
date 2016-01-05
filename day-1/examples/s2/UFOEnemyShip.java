public class UFOEnemyShip {

	private String idcode = "100";
	
	private String getPrivate(){
		return "How did you get this";
	}
	
	private String getOtherprivate(int thisInt, String thatString){
		return "How did you get here " + thisInt +" " + thatString;
	}
	
	public UFOEnemyShip(int number, String randString){
		
		System.out.println("You sent: " + number +" " +randString);
		
	}
	
	public int methodtest (int n){
		return n+1;
	}
	
	/*
	void makeShip() {
		System.out.println("Making enemy ship " +getName());
	}
	*/

}