import java.util.Scanner;

public class Accept_values_and_print_their_Addition {

	public static void main(String[] args) {
		int x, y, z;
        System.out.print("Enter two integers : ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Sum of integers = " + z);

	}

}
