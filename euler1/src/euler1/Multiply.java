package euler1;

public class Multiply {

	public Multiply() {
		int sum = 0;
		for(int i = 0; i <1000; i++) {
			if(i%3==0||i%5==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Multiply();
	}

}
