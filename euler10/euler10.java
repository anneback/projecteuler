public class euler10 {


	//private int arrayList<Integer> primeList;
	private long sumOfPrime;
	private final int CAPACITY = 2000000;

	public euler8 () {
		this.sumOfPrime = 2;
		for (int i = 3; i < CAPACITY; i+=2) {
		//for (int i = CAPACITY; i >= 2; i--) {

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
		if (n%2==0&&n!=2) return false;
		for(int i = 3 ; i < n; i+=2) {
			if(n%i==0){
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