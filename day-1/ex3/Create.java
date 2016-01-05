import java.util.Scanner;

public class Create {

	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Name of the class: ");
		String str = sc.next();
		
		try {
			
			Class cl = Class.forName(str);
			Object o = cl.newInstance();
			System.out.println(o);
			
			A a = new A();
			Class cl2 = a.getClass();
			Object o2 = cl2.newInstance();
			System.out.println(o2);
			
		}
	
		catch (Exception ex){
			
		}
		
	}
	
	

}