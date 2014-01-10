import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;


public class Euler3 {
	private ArrayList<Integer> factors;
	public Euler3() {
		//primeFactoring("600851475143"); 13195
		primeFactoring(new Long("600851475143"));
		for(Integer i: factors) {
			System.out.println(i);
		}
	}
	
	public ArrayList<Integer> primeFactoring(Long n) {
		factors = new ArrayList<Integer>();
		
		/*BigInteger i = new BigInteger("0");
		while(i.compareTo(n)!=-1) {
			if(n.mod(i).equals(BigInteger.ZERO)) {
				factors.add(i.intValue());
				n = n.divide(i);
			}
			i.add(BigInteger.ONE); //i++ in BigInt
		}
		*/
		for(int i = 2;i <= n;i++) {
			if(n%i==0) {
				factors.add(i);
				n = n / i;
			}
		}
		
		return factors;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Euler3();

	}

}
