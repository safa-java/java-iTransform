package itransform;

import java.util.ArrayList;
import java.util.List;

public class AllArmstrong {
	
	public static boolean checkArmstrong(int num) {
        int sum =0;
		
		String number = Integer.toString(num);
		for(int i=0;i<=number.length()-1;i++) {
			int each = (int)Math.pow(Character.getNumericValue(number.charAt(i)),3);
			sum+=each;
			
		}
		if(num==sum) {
			return true;
		}
		else {
			return false;
		}

	}
	

	public static void main(String[] args) {
		
		
		
		List<Integer> all = new ArrayList<>();
		for(int i=100;i<=999;i++) {
			if(checkArmstrong(i)) {
				all.add(i);
				
			}
		}
		System.out.println(all);

	}

}
