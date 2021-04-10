package mx.tec.kata;

import java.util.ArrayList;
import java.util.List;

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
			List<Integer> negativeNumbers = new ArrayList<>();
			int sum = 0;
			
			for (String numString : splitNumbers) {
				int number = Integer.parseInt(numString);
				
				if (number < 0) {
					negativeNumbers.add(number);
				}
				sum += number;
			}
			
			if (!negativeNumbers.isEmpty()) {
				String negativeNumbersList = negativeNumbers.toString().substring(1, negativeNumbers.toString().length() - 1);
				throw new UnsupportedOperationException("Negatives not allowed " + negativeNumbersList);
			}
			return sum;
		}
	}
}
