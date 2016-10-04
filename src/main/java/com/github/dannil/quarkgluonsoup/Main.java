package com.github.dannil.quarkgluonsoup;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("lst.txt");
		QuarkGluonSoup q = new QuarkGluonSoup(file);

		String s = q.generatePseudoScientificMess(5);
		System.out.println(s);
	}
}
