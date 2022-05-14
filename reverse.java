// Write a Java Program to reverse the letters present in the given String.
public class reverse {
	public static void main(String[] args){
		String myStr = "Tarun";
		StringBuffer buffer = new StringBuffer(myStr);
		buffer.reverse();
		String data = buffer.toString();
		System.out.print("Reverse :"+data);
	}
}