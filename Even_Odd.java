package codes;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input= new Scanner(System.in);
		System.out.println("Please Enter a number to check E/O");
		number=input.nextInt();
		if(number%2==0){
			System.out.println("The number you have entered is Even "+number);
		}
		else
			System.out.println("The number you have entered is Odd "+number);
		
		
	}

}
