package functionalInterface;

import java.util.function.Function;

public class Demo {
	public static String add(String string, Function<String, String> fn) {
	    return fn.apply(string);
	}
	
	
	public static void main(String[] args) {
		Function<String, String> fn = 
				  parameter -> parameter + " from lambda";
				String result = Demo.add("Message ", fn);
	}
}
