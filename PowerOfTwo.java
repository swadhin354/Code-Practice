package codes;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	    int num;
	    boolean isPowerOfTwo=true;
	    System.out.println("Enter a number to check a number is power of 2 or not");
	    num=sc.nextInt();
	    int reminder = 0;
	    while(num > 1){
	    reminder = num % 2;
	    if(reminder != 0){
	    isPowerOfTwo = false;
	    break;
	    }else{
	    num = num / 2;
	    }
	    }
	    if(isPowerOfTwo==true){
	    	System.out.println("Power of 2");
	    }
	    else
	    	System.out.println("Not a Power of 2");
	}

}
