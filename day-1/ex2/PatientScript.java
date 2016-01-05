import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class PatientScript {

	public static void main (String [] args) {
	
	System.out.println("Welcome to SDP");
	
	Class c1 = null;
	
	try {
		c1 = Class.forName("Patient");
		
	}
	catch (ClassNotFoundException ex){
		ex.printStackTrace();
	}
	
	
	System.out.println(c1.getName());
	
	Object constructor = null;
	Constructor constructor2 = null;
	
	try {
		
		constructor = c1.getConstructor(String.class, int.class).newInstance("Alejandro",10);	
		
		
		
	}
	
	catch (NoSuchMethodException | SecurityException e) {
			// Exceptions thrown
			e.printStackTrace();
	} 
	catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	} 
	catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	} 
	catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	} 
	catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	
	
	

	}

}