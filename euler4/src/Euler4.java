
public class Euler4 {
	/*
	* Task is to: Find the largest palindrome made from the product of two 3-digit numbers.
	*/

	public Euler4() {
		int twoDigitLow = 100;
		int twoDigitHigh = 999;
		productPalindrome(twoDigitLow, twoDigitHigh);
	}
	
	public void productPalindrome(int start, int end) {
		int largestPalindrome = 0;
		
		for(int i = start;i <= end;i++) {		// Outer loops going from start value to end value
			for (int j = start; j<= end;j++){	// of 3-digits, that calculates the product.
				Integer product = i*j;
				if(isPalindrome(product)){
					if(largestPalindrome<product){
						largestPalindrome = product;
					}
				}
			}
		}
		System.out.println(largestPalindrome);
	}
	/*
	* Check a number if it's a palindrome
	*/
	public boolean isPalindrome(Integer n){
		String number = n.toString(); // Check the product as a String
		StringBuffer digits = new StringBuffer(number);						// eg. n = 9009
		for(int sb = 0; sb < digits.length(); sb++){ 						// 9 0 0 9<-- rightPointer
			int leftPointer = sb;											// ^
			int rightPointer = digits.length()-sb-1;						// leftPointer
			// check if leftPointer and rightPointer are the same
			if(digits.charAt(leftPointer)!=digits.charAt(rightPointer)) {	
				return false;
			}
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Euler4();
	}

}
