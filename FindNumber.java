package itransform;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		int [] nums = {5,12,14,6,78,47,9,23,54,70,34,2};
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0;i<=nums.length-1;i++) {
			if(nums[i]==num) {
				System.out.println(nums[i] + " at " + i);
				
			}
			else {
				System.out.println("not present");
				break;
			}
		}
		

	}

}
