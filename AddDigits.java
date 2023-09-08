import java.util.Scanner;

public class AddDigits {
	
	    public int addDigits(int num) {
	        while (num>9){
	            int sum = 0;
	            while (num>0){
	                sum = sum + (num%10) ;
	                num = num / 10;
	            }
	            num = sum;
	        }
	        return num;
	    }
	

	public static void main(String[] args) {
		System.out.println("Enter the digits: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		AddDigits add = new AddDigits();
		System.out.println("The sum of the digits till the digit is single digit: "+add.addDigits(num));
		
	}

}
