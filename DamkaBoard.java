public class DamkaBoard {
	public static void main (String[] args) {

		int n = Integer.parseInt(args[0]);
		// # feedback: Consider initializing 'i' and 'j' within the for loops to improve code clarity and prevent unintentional reuse of loop variables outside their intended scope.
		int i,j;

		for(i = 1; i <= n ; i++) {
			// # Feedback: Your code structure is well-organized and effectively prints an n-by-n damka board. Good job!
			if(i % 2 == 0) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(j = 0; j < n - 1; j++) {
				System.out.print(" *");
			}
			if(i % 2 != 0) {
				System.out.print(" ");
			}
			System.out.println();
			
		}

	}
}
