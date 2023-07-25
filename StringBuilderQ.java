package itransform;

public class StringBuilderQ {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		//append
		str.append("hey");
		str.append(" ");
		str.append("how are you?");
		System.out.println(str);
		
		//insert
		str.insert(4, " there");
		System.out.println(str);
		//reverse
		str.reverse();
		System.out.println(str);

	}

}
