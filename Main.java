public static void main(String[] args) {
		System.out.println("Enter the digits: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		AddDigits add = new AddDigits();
		System.out.println("The sum of the digits till the digit is single digit: "+add.addDigits(num));
		
	}
