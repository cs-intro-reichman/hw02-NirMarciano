public class OneOfEachStats {
	public static void main (String[] args) {

		int T = Integer.parseInt(args[0]);
		double avg = 0;
		int num_of_two = 0;
		int num_of_three = 0;
		int num_over = 0;

		String str1;
 		boolean check;
 		int n;

		for(int i = 0; i < T ; i++) {

			n = 0;
			str1 = "";
			check = false;

			while (!check) {
 				if(Math.random() < 0.5) {
 					str1 = str1 + "b";
 					n++;
 				}
 				else {
 					str1 = str1 + "g";
 					n++;
 				}
 				check = str1.contains("b") && str1.contains("g");

			}

			if(n == 2) num_of_two++;
 			else if(n == 3) num_of_three++;
 			else num_over++;

 			avg = avg + n;

		}

		avg = avg / T; 

		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + num_of_two);
		System.out.println("Number of families with 3 children: " + num_of_three);
		System.out.println("Number of families with 4 or more children: " + num_over);

		if(num_of_two > num_of_three && num_of_two > num_over) {
			System.out.println("The most common number of children is " + 2);
		}

 		else if(num_of_three > num_over) {
 			System.out.println("The most common number of children is " + 3);
 		}

 		else {
			System.out.println("The most common number of children is " + 4 + " or more");
		}

	}
}


