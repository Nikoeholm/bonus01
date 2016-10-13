package bonus1;

import java.util.Scanner;

public class LowestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Indtast 3 heltal: ");
		
		Scanner scan = new Scanner(System.in); // System.in henter information fra konsollen/keyboard 
		
		double a = scan.nextDouble();  // scan.nextDouble() smager p� n�ste tal 
		double b = scan.nextDouble();
		System.out.println("og så det sidste" +"\n");
		double c = scan.nextDouble(); 
		
		double x;
		double lowestNumber; 
		
		x = Math.min(a,b);
		lowestNumber = Math.min(x,c); 
		/* alternativt, smid x=math.min(a,b) ind som x i ovenst�ende linje*/ 
		
		
		System.out.print("Laveste nummer er: ");
		System.out.println(lowestNumber);
		
		
		scan.close();
		
		//scan.close(); // s�rg altid for at lukke - ellers tager den for meget memory. Processen stopper ikke 

		

	}

}
