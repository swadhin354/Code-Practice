package codes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num;
		int i=0;
		boolean stat=true;
		System.out.println("Enter a number");
		num=input.nextInt();
		for(i=2;i<num;i++){
			if(num%i==0){
				stat=false;
			}
		}
		if(stat==true){
			System.out.println("Prime");
		}
		else
			System.out.println("Not Prime");
	}

}
