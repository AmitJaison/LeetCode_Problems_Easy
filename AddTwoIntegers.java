import java.util.Scanner;

public class AddTwoIntegers {
	    public int sum(int num1, int num2) {	        
	        int result = num1+num2;
	        return result;
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		AddTwoIntegers addTwoIntegers = new AddTwoIntegers();
		System.out.println("Sum of two numbers: "+addTwoIntegers.sum(num1, num2));
		
	}

}

