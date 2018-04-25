
import java.util.Scanner;

public class ArmStrong {

   public static boolean isArmstrong(int input) {
       String inputAsString = input + "";
       int numberOfDigits = inputAsString.length();
       int copyOfInput = input;
       int sum = 0;
       while (copyOfInput != 0) {
           int lastDigit = copyOfInput % 10;
           sum = sum + (int) Math.pow(lastDigit, numberOfDigits);
           copyOfInput = copyOfInput / 10;
       }
       if (sum == input) {
           return true;
       } else {
           return false;
       }
   }

   public static void main(String[] args) {
       @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int inputNumber = scanner.nextInt();
       boolean result = isArmstrong(inputNumber);
       if (result) {
           System.out.println(inputNumber + " is an armstrong number");
       } else {
           System.out.println(inputNumber + " is not an armstrong number");
       }
   }
}