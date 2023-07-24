package itransform;

public class SimpleAndCompund {
	public static double simple(int p, double r, int t) {
		return (p*t*r/100);
	}
	
	 public static double ci(int p, double r, int periods, int t) {
	        double r2 = r / periods;
	        int n = periods * t;
	        return p * Math.pow(1 + r2, n);
	    }
	public static void main(String[] args) {
		int principle = 1000;
		double rate = 0.03;
		int time = 5;
		int periods = 2;
		
		double simpleInterest = simple(principle, rate, time);
		double compound = ci(principle, rate, time,periods);
		
		System.out.println(simpleInterest);
		System.out.println(compound);
		

	}

}
