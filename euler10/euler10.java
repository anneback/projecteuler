import java.lang.Math;
public class euler10 {


	//private int arrayList<Integer> primeList;
	private long sumOfPrime = 0;
	private final int CAPACITY = 10;

	public euler10 () {
		for (int i = 2; i < CAPACITY; i++) {
			if(isPrime(i)) {
				sumOfPrime += i;
			}
		}
		System.out.println(sumOfPrime);
	}

	/*
	prime determinator!
	*/
	public boolean isPrime(int n) {
		// Just need to check the numbers up til the sqrt of n
		// eg. n=16 then sqrt = 4
		// 16 is divisible with 2, 4, 8
		// there will be a number below the sqrt that's a factor of n
		double numberToCountTo = Math.sqrt(n);
		for(int i = 2 ; i <= numberToCountTo; i++) {
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new euler10();
	}
}