public class Patient {
	
	private String name;
	
	private int age;
	
	public Patient (String name, int age){
		this.name = name;
		this.age = age;
	}

	public String opinion(){
		return "This the opinion of " +this.name;
	}

	public String guess(int age){
		return "This the opinion of " +this.name +" age " +this.age;
	}
	
}