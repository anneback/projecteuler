import java.util.ArrayList;


public class Euler6 {

	public Euler6() {
		int START = 1;
		int END = 100;
		long result;
		result =(long) (SquaresOfSum(START, END)-SumOfSquares(START, END));
		System.out.println(result);
	}

	public ArrayList<Float> Interpolate (int start, int end) {
		float step = ((end-start)+1)/end;
		ArrayList<Float> result = new ArrayList<Float>();
		result.add((float)start);
		float newValue = start;
		for(int i = 0; i < end-1; i++){
			newValue = newValue + step;
			result.add(newValue);
		}
		return result;
	}
	
	public float SumOfSquares (int start, int end) {
		ArrayList<Float> numbers = Interpolate(start, end);
		float sum = 0;
		for(Float f : numbers){
			float square = f*f;
			sum = sum + square;
		}
		return sum;
	}
	
	public float SquaresOfSum (int start, int end) {
		ArrayList<Float> numbers = Interpolate(start, end);
		float sum = 0;
		float addition = 0;
		for(Float f : numbers){
			addition = addition + f;
		}
		sum = addition*addition;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Euler6();
	}
}
