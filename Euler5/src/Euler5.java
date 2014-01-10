import java.util.Arrays;


public class Euler5 {

	private static int N = 10;
	
	public Euler5() {
		//System.out.println("LCM is: "+Lcm(2520));
		for (int i = 1; i < Integer.MAX_VALUE;i++) {
			if(Lcm(i)==true){
				System.out.println("smallest number for 1-20 multiples: " + i);
				break;
			}
		}
	}
	
	public boolean Lcm(int value){
		boolean[] divisor = new boolean[20];
		boolean[] trueVector = new boolean[divisor.length];
		
		for(int t = 0; t < trueVector.length;t++) {
			trueVector[t] = true;
		}
		for(boolean b : divisor) {
			b = false;
		}
		for(int i = 1;i <= 20;i++) {
			if(value%i==0){
				divisor[i-1] = true;
			}
			//System.out.println(divisor[i-1]);
		}

		boolean areEquals = Arrays.equals(divisor,trueVector);
		
		if(areEquals == true) {
			//System.out.println("div vs true is TRUE");
			return true;
		} else {
			return false;
		}
		
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Euler5();
	}

}
