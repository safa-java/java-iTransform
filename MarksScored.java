package itransform;

import java.util.Scanner;

public class MarksScored {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] marksA = {23,34,56};
		int[] marksB = {45,56,50};
		int[] marksC = {67,78,54};
		
		int totalA = 0;
		int totalB = 0;
		int totalC = 0;
		
		
		for(int i=0;i<=marksA.length-1;i++) {
			totalA += marksA[i];
		}
		
		System.out.println("total marks-A:" + totalA);
		System.out.println("Avg marks-A: "+ totalA/marksA.length);
		
		for(int i=0;i<=marksB.length-1;i++) {
			totalB += marksB[i];
		}
		
		System.out.println("total marks-B:" + totalB);
		System.out.println("Avg marks-B: "+ totalB/marksB.length);
		
		for(int i=0;i<=marksC.length-1;i++) {
			totalC += marksC[i];
		}
		
		System.out.println("total marks-C:" + totalC);
		System.out.println("Avg marks-C: "+ totalC/marksC.length);
		
		int totalStudent1 = marksA[0] + marksB[0] + marksC[0];
		int avgStudent1 = totalStudent1/3;
		System.out.println("total marks of Student 1: " + totalStudent1 );
		System.out.println("Avg marks: " + avgStudent1);
		
		int totalStudent2 = marksA[1] + marksB[1] + marksC[1];
		int avgStudent2 = totalStudent2/3;
		System.out.println("total marks of Student 2: " + totalStudent2);
		System.out.println("Avg marks: " + avgStudent2);
		
		int totalStudent3 = marksA[2] + marksB[2] + marksC[2];
		int avgStudent3 = totalStudent3/3;
		System.out.println("total marks of Student 1: " + totalStudent3 );
		System.out.println("Avg marks: " + avgStudent3);
		

	}

}
