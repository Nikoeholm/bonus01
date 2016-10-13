package bonus1;

import java.util.Scanner;

public class LowestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Indtast 3 tal: ");
		
		Scanner scan = new Scanner(System.in); // System.in henter information fra konsollen/keyboard 
		
		double a = scan.nextDouble();  // scan.nextDouble() smager på næste tal 
		double b = scan.nextDouble();
		double c = scan.nextDouble(); 
		
		double x;
		double lowestNumber; 
		
		x = Math.min(a,b);
		lowestNumber = Math.min(x,c); 
		/* alternativt, smid x=math.min(a,b) ind som x i ovenstående linje*/ 
		
		
		System.out.print("Lowest number: ");
		System.out.println(lowestNumber);
		
		scan.close();
		
		//scan.close(); // sørg altid for at lukke - ellers tager den for meget memory. Processen stopper ikke 

		

	}

}
