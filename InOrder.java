public class InOrder {
	public static void main (String[] args) {

		int x = -1;
		int y = -2;
		
		while(x >= y) {
 			
 			y = x;
			x = (int) ((Math.random() * 11) - 1);
			if (x >= y) {
			System.out.print(x + " ");
			}
		}

		System.out.println();


	}
}