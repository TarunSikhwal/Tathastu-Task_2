// Write a Java program to calculate a Factorial of a number.
public class factorial {
	public static void main(String args[]) {
		int fact = 1;
		int num = 5;
		while(num>1) {
			fact = fact * num;
			num = num -1;
		}
		System.out.print("Factorial : "+fact);
	}
}
