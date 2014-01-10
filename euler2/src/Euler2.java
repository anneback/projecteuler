
public class Euler2 {
	
	public Euler2() {
		int N = 40;
		int sum = 0;
		for(int i = 0;i < N;i++) {
			if(Fib(i)%2==0 && Fib(i)<4000000) {
				sum = sum + Fib(i);
			}
			if(Fib(i)>4000000) {
				System.out.println("Exceeded 4M");
			}
		}
		System.out.println(sum);
		
	}

	public int Fib(int n){
		if(n<=1) {
			return n;
		} else {
			return Fib(n-1)+Fib(n-2);
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Euler2();
	}

}
