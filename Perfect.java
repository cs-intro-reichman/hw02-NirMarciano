public class Perfect {
	public static void main (String[] args) {

		int N = Integer.parseInt(args[0]);
		int sum = 0;

		String str1 = N + " is a perfect number since " + N + " = ";

		for (int i = 1; i < N; i++) {

			if (N % i == 0) {
				str1 = str1 + i + " + ";
				sum = sum + i;
			}

		}

		if (N == sum) {
			str1 = str1.substring(0, (str1.length() - 3));
			System.out.println(str1);
		}
		else {
			System.out.println(N + " is not a perfect number");
		}
	}
}


