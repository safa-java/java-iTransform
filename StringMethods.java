package itransform;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Java string pool refers to the collection of Strings stored in heap memory";
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.replace('a', '$'));
		System.out.println(s.contains("collection"));
		System.out.println(s.equals("java string pool refers to the collection of strings stored in heap memory"));
		System.out.println(s.equalsIgnoreCase("java string pool refers to the collection of strings stored in heap memory"));
		

	}

}
