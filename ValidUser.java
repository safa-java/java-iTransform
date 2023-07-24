package itransform;

import java.util.Scanner;

public class ValidUser {
	
	public static boolean isValidUser(String s) {
		if(s.isBlank() && !s.matches("^[a-zA-Z0-9_]+$") ) {
			return false;
		}
		return true;
	
	}
	public static boolean isValidPass(String s) {
		if (!s.matches(".*[A-Z].*") || !s.matches(".*[a-z].*") || !s.matches(".*\\d.*") ||  !s.matches(".*[^a-zA-Z\\d].*")) { 
	            return false;
	        }
		return true;
		
	}

	public static void main(String[] args) {
		int attempts=0;
		
		while(attempts<3) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Username: ");
			String user =  sc.nextLine();
			
			System.out.println("Password: ");
			String password = sc.nextLine();
			
			if(isValidUser(user)&&isValidPass(password)) {
				System.out.println("welcome");
				break;
			}
			else {
				attempts++;
				if(attempts==3) {
					System.out.println("Contact Admin");
				}
				else {
				System.out.println("try again");
				
			}
			}
			
			
			
			
		}
		
		

		
		
		

	}

}