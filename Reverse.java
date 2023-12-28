public class Reverse {
	public static void main (String[] args) {

		String str1 = args[0];
		String str2 = "";

		int len = str1.length();

		for(int i = 0; i < len; i++ ) {
			//str2.charAt(i) = str1.charAt(len - i);
			str2 = str2 + str1.charAt((len - 1) - i);
		}

		System.out.println(str2);
		System.out.println("The middle character is " + str2.charAt((len/2)));

	}
}