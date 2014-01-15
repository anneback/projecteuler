public class euler8 {


	//private int arrayList<Integer> primeList;
	private int sumOfPrime = 0;
	private final int CAPACITY = 10;

	public euler8 {
		for (int i = CAPACITY; i > 0; i--)
			if(isPrime(i)) {
				sumOfPrime += i;
			}
	}

	/*
	prime determinator!
	*/
	public boolean isPrime(double n) {
		for(int i = 2 ; i < Integer.MAX_VALUE; i++) {
			if(n%i==0){
				return false;
			}
		}
		return true;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new euler8();
	}
}