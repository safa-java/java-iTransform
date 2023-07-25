package itransform;

public class StringBufferAppend {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		//append
		str.append("hey");
		str.append(" ");
		str.append("how are you?");
		System.out.println(str);
		
		
		//insert
		str.insert(4, "there ");
		System.out.println(str);
		
		//reverse
		str.reverse();
		System.out.println(str);

	}

}
