package com.github.dannil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuarkGluonSoup {

	private File file;

	private List<String> words;

	private QuarkGluonSoup() {
		this.words = new ArrayList<String>();
	}

	public QuarkGluonSoup(File file) {
		this.words.add("Quark");
		this.words.add("Gluon");
		this.words.add("Soup");
		this.words.add("Subspace");
		this.words.add("Dimension");
		this.words.add("Strings");
		this.words.add("Vibration");
		this.words.add("Quantum-fluctuations");
		this.words.add("Spacetime");
		this.words.add("Entanglement");
		this.words.add("Quantum");
		this.words.add("Weak boson");
		this.words.add("Einsteinium");
		this.words.add("Quantum-chemistry");
		this.words.add("Deca");
		this.words.add("Yocta");
		this.words.add("Lindbergh's");
		this.words.add("Third");
		this.words.add("Boltzmann's");
		this.words.add("Photo-electric");
		this.words.add("Negative");
		this.words.add("Gravity");
		this.words.add("Anti-matter");
		this.words.add("Photon");
		this.words.add("Proton");
		this.words.add("NP");
		this.words.add("Neutron");
		this.words.add("Classic");
		this.words.add("Third-degree");
		this.words.add("Multiverse");
		this.words.add("Mechanics");
		this.words.add("Phantom");
		this.words.add("Drive");
		this.words.add("Spin");
		this.words.add("Fusion");
		this.words.add("Thermonuclear");
		this.words.add("Thermodynamics");
		this.words.add("Decay");
		this.words.add("Alpha");
		this.words.add("Beta");
		this.words.add("Gamma");
		this.words.add("Dark matter");
		this.words.add("Dark energy");
		this.words.add("Vacuum energy");
		this.words.add("Polarization");
		this.words.add("Cloaking device");
		this.words.add("Holographic");
		this.words.add("Rotating");
		this.words.add("Spring");
		this.words.add("Pendulum");
		this.words.add("Chaos");
		this.words.add("Chaotic");
		this.words.add("Rift");
		this.words.add("Super symmetry");
		this.words.add("Exiled");
		this.words.add("Excitation");
		this.words.add("Chromo dynamics");
		this.words.add("Hyperverse");
		this.words.add("Engineering");
		this.words.add("Simulated");
		this.words.add("Accelerator");
		this.words.add("Tunneling");
		this.words.add("Particle");
		this.words.add("Computer");
		this.words.add("Paradox");
		this.words.add("Causality");
		this.words.add("Lightspeed");
		this.words.add("Field");
		this.words.add("Potassium");
		this.words.add("Anti");
		this.words.add("Black hole");
		this.words.add("White dwarf");
		this.words.add("Supernova");
		this.words.add("Tractor beam");
		this.words.add("Newton");
		this.words.add("Power");
		this.words.add("Fabric");
		this.words.add("Quadruple");
		this.words.add("Polynomial");
		this.words.add("Mononomial");
		this.words.add("Infinity");
		this.words.add("Googleplex");
		this.words.add("Irrational");
		this.words.add("Infinitesimal");
		this.words.add("Continuum");
		this.words.add("Measurement");
		this.words.add("Helium");
		this.words.add("Hydrogen");

		for (int i = 0; i < 5; i++) {
			System.out.println(generatePseudoScientificMess(5));
		}
	}

	public String generatePseudoScientificMess(int length) {
		List<String> tempWords = new ArrayList<String>(this.words);

		Random r = new Random();

		// Build output
		String output = "";
		for (int i = 0; i < length; i++) {
			// System.out.println(output);
			int pos = r.nextInt(tempWords.size());

			output += tempWords.get(pos);
			if (i < length - 1) {
				output += " ";
			}
			tempWords.remove(pos);
		}

		// Lowercase words
		char[] chars = output.toCharArray();
		// for (int i = 0; i < output.length(); i++) {
		// if (chars[i] == ' ') {
		// chars[i + 1] = Character.toLowerCase(chars[i + 1]);
		// }
		// }

		return new String(chars);
	}

}
