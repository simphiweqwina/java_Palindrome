import java.util.Scanner;

class Palindrome{

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	//instantiate class
	Palindrome pd = new Palindrome();
	//prompt for number
	System.out.print("Enter any integer: ");

	//printResult
	pd.printResult((sc.next()));
	}

	public void printResult(String num){
		boolean palindrome = false;

		


		for (int i =0;i <(num.length()/2); ) {
			if (num.charAt(i) == num.charAt(num.length()-(i+1)) ){
				palindrome = true;
				i++;
			}else{
				palindrome = false;
				i=num.length();
			}
		}

		if (palindrome == false) {
			System.out.print(num+" is not a Palindrome Number");
		}else{
			System.out.print(num+" is a Palindrome Number");
		}
	}


}