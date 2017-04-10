package competitions.week_of_code_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Beautiful_World {
	static Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

	public static void main(String[] args) throws IOException {
		String input = scanner.next();
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == input.charAt(i + 1) || (isVowel(input.charAt(i)) && isVowel(input.charAt(i + 1)))) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
		scanner.close();
	}

	private static boolean isVowel(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y');
	}
}