package mx.tec.kata;

public class StringCalculator {
	public int add(String numbers) {
		String delimiter = ",";
		if (numbers.isBlank()) {
			return 0;
		} else {
			String sanitizedNumbers = numbers;
			if (numbers.startsWith("//")) {
				delimiter = numbers.substring(2, 3);
				sanitizedNumbers = numbers.substring(4);
			}
			
			String[] splitNumbers = sanitizedNumbers.split("\\n|" + delimiter);
			int sum = 0;
			
			for (String numString : splitNumbers) {
				sum += Integer.parseInt(numString);
			}
			return sum;
		}
	}
}
