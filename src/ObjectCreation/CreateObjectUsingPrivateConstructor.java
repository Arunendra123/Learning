package ObjectCreation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateObjectUsingPrivateConstructor {
	public static void main(String args[]) throws SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor con[] = Class.forName(args[0]).getDeclaredConstructors();
		con[0].setAccessible(true);
		ClassRoom cr=(ClassRoom)con[0].newInstance();
		cr.setName(args[0]);
		System.out.println(cr.getName());
	}
}
