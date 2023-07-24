package itransform;

import java.util.Scanner;

public class TaxPayable {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CTC: ");
		double salary = sc.nextDouble();
	
		if (salary<=180000) {
			 System.out.println("NILL");
	}
		else if(salary>=181001 && salary<=300000) {
			System.out.println("Tax Payable: "+ salary*0.1);
		}
		else if(salary>=300001 && salary<=500000) {
			System.out.println("Tax Payable: "+ salary*0.2);
		}
		else if(salary>=500001 && salary<=1000000) {
			System.out.println("Tax Payable: "+ salary*0.3);
		}

}
}
