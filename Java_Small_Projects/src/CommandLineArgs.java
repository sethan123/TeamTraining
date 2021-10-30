import java.util.Scanner;

public class CommandLineArgs {

	public static void main(String[] args) {
		 int a, b, c;
	        
		
	        System.out.print("Enter the integers : ");
	        Scanner in = new Scanner(System.in);
	        a = in.nextInt();
	        b = in.nextInt();
	        c = in.nextInt();
	        if (a > b && a > c) {
	            System.out.println("Largest Number is : " + a);
	        } else if (b > c) {
	            System.out.println("Largest Number is : " + b);
	        } else {
	            System.out.println("Largest Number is : " + c);
	        }
	    }
	}

	