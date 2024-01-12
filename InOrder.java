public class InOrder {
	public static void main (String[] args) {
		// # Feedback: Consider using a do-while loop to eliminate the need for initializing x and y outside the loop.
		int x = -1;
		int y = -2;
		
		while(x >= y) {
 			// # Feedback: Consider removing extra spacing between lines to improve code aesthetics.
 			y = x;
			x = (int) ((Math.random() * 11) - 1);
			if (x >= y) {
			System.out.print(x + " ");
			}
		}

		System.out.println();


	}
}
