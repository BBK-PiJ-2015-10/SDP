import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class ReflectionGuide {

	public static void main (String args []){
		
		try {
			
			Class cls = Class.forName("methodsTest");
			
			Field[] fields = cls.getFields();
			
			Field KoolAid = cls.getField("coolaid");
			
			int KoolAidInt = KoolAid.getInt(KoolAid);
			
			
			System.out.println("Coolaid: " +KoolAidInt);
			
			for (int i=0; i<fields.length;i++){
				System.out.println("Field: " +fields[i]);
				
			}
			
			
			Method methodList [] = cls.getDeclaredMethods();
			System.out.println("Class Name: " +methodList[0].getDeclaringClass());
			for (int i=0; i<methodList.length;i++){
				System.out.println("Method Name : "  +methodList[i].getName());
				
			}

		
		}
		
		catch (Throwable e){
			System.out.println("Error: " +e.getMessage());
			
		}
		
		
		
		
	}

}