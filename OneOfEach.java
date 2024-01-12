public class OneOfEach {
	public static void main (String[] args) {
 
 		String str1 = "";
 		boolean check = false;
 		int n = 0;

 		while (!check) {
 			if(Math.random() < 0.5) {
 				str1 = str1 + "b ";
 				n++;
 				System.out.print("b ");
 			}
 			else {
 				str1 = str1 + "g ";
 				n++;
 				System.out.print("g ");
 			}
 			check = str1.contains("b") && str1.contains("g") ;
			// # Feedback: It seems you're using the 'contains' method, which might not have been covered in class. 
        		// If this method is not allowed, consider implementing a custom function or using alternative approaches taught in class.
 		}

 		System.out.println();
 		System.out.println("You made it... and you now have " + n + " children.");

	}
}
