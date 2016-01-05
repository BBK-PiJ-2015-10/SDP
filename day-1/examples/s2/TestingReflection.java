import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

public class TestingReflection {

	public static void main (String [] args ) {
		
		Class reflectClass = UFOEnemyShip.class;
		
		String className = reflectClass.getName();
		
		System.out.print(className + "\n");
		
		int classModifier = reflectClass.getModifiers();
		
		// isAbstract, isFinal, isInterface, isPrivate, isProtected
		// isStatic, isStrict, isSynchronized, isVolatile
		
		System.out.println(Modifier.isPublic(classModifier));
		
		Class [] interfaces = reflectClass.getInterfaces();
		
		//Class classSuper = reflectClass.getSuperClass();
		
		Method[] classMethods = reflectClass.getMethods();
		
		for (Method method : classMethods) {
			System.out.println("Method Name: " +method.getName());
			
			if (method.getName().startsWith("get")){
				System.out.println("Getter Method");
			}
			
			if (method.getName().startsWith("set")){
				System.out.println("Setter Method");
			}
			
			System.out.println("return type " + method.getReturnType());
			
			Class [] parameterType = method.getParameterTypes();
			System.out.println("Parameters ");
			
			for (Class parameter : parameterType){
				System.out.println(parameter.getName());
			}
		}
		
		Constructor constructor = null;
		
		//@SuppressWarnings("unchecked")
		Object constructor2 = null;
		
		
		
		try {
		
		//constructor = reflectClass.getConstructor(new Class[]{EnemyShipFactory.class});
		  
		  //@SuppressWarnings("unchecked")
		  constructor = reflectClass.getConstructor(int.class,String.class);
		
		  @SuppressWarnings() 
		  constructor2 = reflectClass.getConstructor(int.class,String.class).newInstance(12,"Random String");
		
		}
		
		catch (NoSuchMethodException | SecurityException e){
			e.printStackTrace();		
		}
		catch (InstantiationException e){
			e.printStackTrace();
		}
		catch (IllegalAccessException e){
			e.printStackTrace();
		}
		catch (IllegalArgumentException e){
			e.printStackTrace();
		}
		catch (InvocationTargetException e){
			e.printStackTrace();
		}
		
		System.out.println("Left on 12.43 on Java Reflection Tutorial Derek Banas");
		
		Class[] constructParameters = constructor.getParameterTypes();
		
		for( Class parameter : constructParameters ){
			System.out.println(parameter.getName());
		}
		
		Field privateStringName = null;
		
		//System.out.println(https://www.youtube.com/watch?v=agnblS47F18);
		
	
	}

}