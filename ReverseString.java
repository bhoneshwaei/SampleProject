
// Revers a given string.

package project1;
public class ReverseString {

	public static void main(String[] args) {
		String orignal = "Bhagyashree";
		String reversed = reverseString(orignal);
		System.out.println("Original String : " + orignal);
		System.out.println("Reverse String : "+ reversed);

	}
	public static String reverseString(String str)
	{
		StringBuilder reversed = new StringBuilder(str);
		return reversed.reverse().toString();	
	
		}

}
