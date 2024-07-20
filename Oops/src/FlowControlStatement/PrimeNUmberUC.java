package FlowControlStatement;

public class PrimeNUmberUC {

	public static void PrimeNumberCheack(int N) {
		int i, m = 0, flag = 0;
		m = N / 2;
		if (N == 0 || N == 1) {
			System.out.println(N + "is not Prime Number");
		} else {
			for (i = 2; i <= m; i++) {
				if (N % i == 0) {
					System.out.println(N + "is not Prime Number");
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.println(N + "is prime number");
			}
		}
	}

	public static void main(String[] args) {

		PrimeNumberCheack(15);

		PrimeNumberCheack(155);

		PrimeNumberCheack(5);

		PrimeNumberCheack(105);

		PrimeNumberCheack(25);

		PrimeNumberCheack(55);

	}

}
