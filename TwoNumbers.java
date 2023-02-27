import java.util.Scanner;

public class TwoNumbers{
	 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        int num1 = sc.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = sc.nextInt();

		        int large = num1<num2 ? num2 : num1;
		        System.out.println(large+" is larger number");

		        sc.close();
		    }
		

	}


