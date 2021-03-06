public class Euler8 {
	/*
	* Find the greatest product of five consecutive digits in the 1000-digit number.
	*/

	private int greatestProduct = 0;

	private final String input = "73167176531330624919225119674426574742355349194934"+
							"96983520312774506326239578318016984801869478851843"+
							"85861560789112949495459501737958331952853208805511"+
							"12540698747158523863050715693290963295227443043557"+
							"66896648950445244523161731856403098711121722383113"+
							"62229893423380308135336276614282806444486645238749"+
							"30358907296290491560440772390713810515859307960866"+
							"70172427121883998797908792274921901699720888093776"+
							"65727333001053367881220235421809751254540594752243"+
							"52584907711670556013604839586446706324415722155397"+
							"53697817977846174064955149290862569321978468622482"+
							"83972241375657056057490261407972968652414535100474"+
							"82166370484403199890008895243450658541227588666881"+
							"16427171479924442928230863465674813919123162824586"+
							"17866458359124566529476545682848912883142607690042"+
							"24219022671055626321111109370544217506941658960408"+
							"07198403850962455444362981230987879927244284909188"+
							"84580156166097919133875499200524063689912560717606"+
							"05886116467109405077541002256983155200055935729725"+
							"71636269561882670428252483600823257530420752963450";
							
							//String input = "1234560";
	public Euler8() {
		//System.out.println(countFiveConsecutiveDigitsInString("12345"));
		String currentFive = "";
		int calculatedProduct = 0;
		for (int i = 0;i<=input.length()-5;i++) {
			//System.out.println("i: "+i);
			if (i+5<=input.length()) {
				currentFive = input.substring(i,i+5);
				//System.out.println("current5: "+currentFive);
				calculatedProduct = countFiveConsecutiveDigitsInString(currentFive);
				if (greatestProduct<calculatedProduct) {
					greatestProduct = calculatedProduct;
				}
			} else {
				break;
			}
		}
		System.out.println("Greatest: "+greatestProduct);
	}

	public int countFiveConsecutiveDigitsInString (String fiveDigits) {
		int evaluatedProduct = 1;
		char[] tempCA = fiveDigits.toCharArray();
		// if the string contains 0 the product will be 0, 
		// therefore we only do things if it's not 0.
		//if(!fiveDigits.contains("0")){
			for (int i = 0; i < fiveDigits.length(); i++) {
				//hardcoded -48 for getting the number representations correct
				Integer currentInt = Integer.valueOf(tempCA[i])-48;
				evaluatedProduct = evaluatedProduct * currentInt;
			}
			return evaluatedProduct;
		//}
		//return evaluatedProduct;
	}

	public static void main(String[] args) {
		new Euler8();
	}
}