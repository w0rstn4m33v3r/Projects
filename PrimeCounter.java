package primecounter;

import java.util.Scanner;

public class PrimeCounter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What number do you want to count to? ");
		int max = input.nextInt();
		System.out.println("Do you want to know if the number is even or odd? (y or n)");
		String strevenodd = input.next();
		char evenodd;
		evenodd = strevenodd.charAt(0);
		System.out.println("Do you want to know which numbers are Prime? (y or n)");
		String strprime = input.next();
		char prime = strprime.charAt(0);
		
		for(int i = 0; i < max+1; i++){
			if((evenodd == 'y' || evenodd == 'Y') && (prime == 'n' || prime == 'N')){
				System.out.print(i);
				if(i % 2 == 0){
					System.out.println(" is an Even Number");}
				else if (i%2 != 0){
					System.out.println(" is an Odd Number");}
			}
			else if ((evenodd == 'n' || evenodd == 'N') &&  (prime == 'n' || prime == 'N')){
				System.out.println(i);}
			else if((evenodd == 'y' || evenodd == 'Y') && (prime == 'y' || prime == 'Y')){
				System.out.print(i);
				if(i % 2 == 0) {
					System.out.println(" is an Even Number and" + isPrime(i));}
				else if (i%2 != 0){
					System.out.println(" is an Odd Number and" + isPrime(i));}
			}
			else if ((evenodd == 'n' || evenodd == 'N') && (prime == 'y' || prime == 'Y')){
				System.out.println(i + isPrime(i));}
		}
		input.close();
		System.out.println("end of program.");
	}
		public static String isPrime(int x) {
			if (((x * x - 1) % 24 == 0) || (x == 2 || x == 3)){
				return " is Prime!";}
			else{
				return " is not Prime.";}
	}
}
