package DataDrivenTesting;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random random=new Random();
		int ranint=random.nextInt(2000);
		System.out.println(ranint);
	}

}
