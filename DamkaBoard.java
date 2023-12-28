public class DamkaBoard {
	public static void main (String[] args) {

		int n = Integer.parseInt(args[0]);
		int i,j;

		for(i = 1; i <= n ; i++) {

			if(i % 2 == 0) {
				System.out.print(" ");
			}

			for(j = 0; j < n; j++) {
				System.out.print("* ");
			}

			System.out.println();
			
		}

	}
}