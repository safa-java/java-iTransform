package itransform;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		
		if(sub1>60 && sub2>60 && sub3>60) {
			System.out.println("passed");
		}
		else if(sub1>60 && sub2>60 && sub3<60 || sub2>60 && sub3>60 &&sub1<60||sub3>60 && sub1>60 && sub2<60) {
			System.out.println("Promoted");
		}
		else {
			System.out.println("Failed");
		}

	}

}
