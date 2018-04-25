package codes;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		int num1=0;
		int i=0;
		System.out.println("Enter a number");
		num=sc.nextInt();
		int num2=num;
		String len=Integer.toString(num);
		for(i=0;i<len.length();i++){
			num1+=num%10;
			num1*=10;
			num=num/10;
		}
		num1=num1/10;
		if(num2==num1){
			System.out.println(" is pallindrome");
		}
		else
			System.out.println(" is not pallindrome");
	}

}
