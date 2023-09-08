import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
	HashMap<Character, Integer> romanToInteger = new HashMap<>();
	public RomanToInteger() {
		romanToInteger.put('I', 1);
		romanToInteger.put('V', 5);
		romanToInteger.put('X', 10);
		romanToInteger.put('L', 50);
		romanToInteger.put('C', 100);
		romanToInteger.put('D', 500);
		romanToInteger.put('M', 1000);
	}

	public Integer convertToInteger(String romanNumeral) {
		int result = 0;
		for (int i = 0; i < romanNumeral.length(); i++) {
			int currentValue = romanToInteger.get(romanNumeral.charAt(i));
			if (i < romanNumeral.length() - 1) {
				int nextValue = romanToInteger.get(romanNumeral.charAt(i + 1));
				if (currentValue < nextValue) {
					result -= currentValue;
				} else {
					result += currentValue;
				}
			} else {
				result += currentValue;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		RomanToInteger converter = new RomanToInteger();
		System.out.print("Enter the Roman Numeral: ");
		Scanner sc = new Scanner(System.in);
		String romanNumeral = sc.nextLine();
		int integerEquivalent = converter.convertToInteger(romanNumeral);
		System.out.println("The integer equivalent of " + romanNumeral + " is " + integerEquivalent);
	}
}
