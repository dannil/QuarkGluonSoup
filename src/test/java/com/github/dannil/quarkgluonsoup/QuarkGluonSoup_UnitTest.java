package com.github.dannil.quarkgluonsoup;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class QuarkGluonSoup_UnitTest {

	private List<String> words;
	private File file;

	@Before
	public void setup() throws IOException {
		this.file = new File("testwords.txt");

		this.words = Arrays.asList("Quark", "Gluon", "Soup", "Neutron", "Proton", "Electron");
		Path path = Paths.get(this.file.toURI());
		Files.write(path, this.words, StandardCharsets.UTF_8);
	}

	@Test
	public void generateMaxLength() throws IOException {
		int length = this.words.size();

		QuarkGluonSoup q = new QuarkGluonSoup(this.file);
		String s = q.generatePseudoScientificMess(length);

		for (int i = 0; i < length; i++) {
			assertTrue(s.contains(this.words.get(i)));
		}

	}
}
