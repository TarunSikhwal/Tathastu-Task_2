// Write a Java program to find out whether the given String is Palindrome or not.
public class palindrome {
	public static void main(String args[]) {
		String myStr = "abcba";
		StringBuffer buffer = new StringBuffer(myStr);
		buffer.reverse();
		String data = buffer.toString();
		if(myStr.equals(data)) {
			System.out.print("Given String is Palindrome");
		}else {
			System.out.print("Given String is not Palindrome");
		}
	}
}
