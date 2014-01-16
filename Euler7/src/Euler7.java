
public class Euler7 {
	/*
	* Task is to calculate the 10001th prime
	*/
	private int primeCounter = 0;
	private final int N = 10001;
	private long nthPrime;
	public Euler7() {
		//Main loop
		for (int currentValue = 2; primeCounter<N; currentValue++) {
			if (isPrime(currentValue)) {
				nthPrime = currentValue;
				primeCounter++;
			}
		}
		System.out.println(nthPrime);
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Euler7();
	}

}
