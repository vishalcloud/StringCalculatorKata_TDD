package StringCalculatorKata;

public class StringCalculator {
	String[] strArray;
	int sum = 0;
	int intSum;
	String delimiter = ",|\\n";

	public int StrCalc(String input) {
		if (input == "") {
			return 0;
		} else if (input.length() == 1) {
			return Integer.parseInt(input);
		}
		while (input.startsWith("//")) {
			int x = input.indexOf("\n");
			delimiter = input.substring(2, x);
			input = input.substring(x + 1);
		}
		// if (input.contains(",")||input.contains("\n")) {
		strArray = (input.split(delimiter));
		for (String sum1 : strArray) {
			sum += Integer.parseInt(sum1);
		// }
		}

		return sum;
	}

}
