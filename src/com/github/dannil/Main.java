package com.github.dannil;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("lst.txt");
		QuarkGluonSoup q = new QuarkGluonSoup(file);

		String s = q.generatePseudoScientificMess(5);
	}
}
