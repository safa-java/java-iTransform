package itransform;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		
		String number = Integer.toString(num);
		for(int i=0;i<=number.length()-1;i++) {
			int each = (int)Math.pow(Character.getNumericValue(number.charAt(i)),3);
			sum+=each;
			
		}
		if(num==sum) {
			System.out.println("yes armsstrong!");
		}
		else {
			System.out.println("no");
		}

	}

}
