package FlowControlStatement;

public class ForLoopDemo {

	public static void main(String[] args) {
		long p;
		int i;
		double b;
		System.out.println("2 to power-n n 2 power n");
		p = 1;
		for (i = 0; i <= 10; ++i)
			
		{
			if (i == 0)
				p = 1;
			else
				p = p * 2;
			b = 1.0 / (double) p;
			System.out.println("" + i + "" + b + "" + p);

		}

	}
}
