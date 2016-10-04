package com.github.dannil.quarkgluonsoup;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuarkGluonSoup {

	private List<String> words;

	private QuarkGluonSoup() {
		this.words = new ArrayList<String>();
	}

	public QuarkGluonSoup(File file) throws IOException {
		this();

		this.words = Files.readAllLines(Paths.get(file.toURI()), StandardCharsets.UTF_8);
	}

	public String generatePseudoScientificMess(int length) {
		List<String> tempWords = new ArrayList<String>(this.words);

		Random r = new Random();

		// Build output
		String output = "";
		for (int i = 0; i < length; i++) {
			// System.out.println(output);
			int position = r.nextInt(tempWords.size());

			output += tempWords.get(position);
			output += " ";

			tempWords.remove(position);
		}

		// Lowercase words
		char[] chars = output.toCharArray();
		// for (int i = 0; i < output.length(); i++) {
		// if (chars[i] == ' ') {
		// chars[i + 1] = Character.toLowerCase(chars[i + 1]);
		// }
		// }

		return new String(chars).trim();
	}

}
