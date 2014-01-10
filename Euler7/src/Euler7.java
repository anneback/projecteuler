
public class Euler7 {
	
	private int primeCounter = 0;
	private int currentValue = 2;
	
	public Euler7() {
		int n = 10;
		int N = 10001;
		
		while(primeCounter<n) {
			if(currentValue==2) {
				primeCounter++;
				currentValue++;
			}else {
				if (isPrime(currentValue)) {
					System.out.println(currentValue);
					primeCounter++;
				}
				currentValue = currentValue + 2;
			}
		}
		System.out.println(primeCounter);
		
	}
	
	public boolean isPrime(double n) {
		for(int i = 2 ; i < Integer.MAX_VALUE; i++) {
			if(n%i==0){
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
