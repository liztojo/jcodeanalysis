import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class reflec{
    public static void main(String args[]) throws Exception{
	Class c = Class.forName("C:\\Users\\liz.varghese\\eclipse-workspace\\test\\src\\test\\test.java");
	System.out.println("\nMethods:");
	Method methods[] = c.getDeclaredMethods();
	for (Method meth : methods)
	System.out.println(" " + meth);
	}
}