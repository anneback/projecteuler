
public class Euler4 {

	public Euler4() {
		int twoDigitLow = 100;
		int twoDigitHigh = 999;
		derp(twoDigitLow, twoDigitHigh);
		// TODO Auto-generated constructor stub
	}
	
	public void derp (int start, int end) {
		int largestPalindrome = 0;
		for(int i = start;i <= end;i++) {
			for (int j = start; j<= end;j++){
				Integer product = i*j;
				String number = product.toString();
				//System.out.println(number);
				StringBuffer digits = new StringBuffer(number);				

				/*int left = 0;
				int right = digits.length()-sb-1;
				while(left < right){
					if(digits.charAt(left)==digits.charAt(right)){
						if(largestPalindrome<product){
							largestPalindrome = product;
						}
					
				}*/
					
				for(int sb = 0; sb < digits.length(); sb++){
					int left = sb;
					int right = digits.length()-sb-1;
					if(digits.charAt(0)==digits.charAt(digits.length()-1) && digits.charAt(1)==digits.charAt(digits.length()-2) && digits.charAt(2)==digits.charAt(digits.length()-3)){
						if(largestPalindrome<product){
							largestPalindrome = product;
						}
						//System.out.println("Palindrom: "+product);
					}
				}
			}
		}
		System.out.println(largestPalindrome);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Euler4();
	}

}
