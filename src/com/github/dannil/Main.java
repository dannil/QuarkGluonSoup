package com.github.dannil;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<>();

		lst.add("Quark");
		lst.add("Gluon");
		lst.add("Soup");
		lst.add("Subspace");
		lst.add("Dimension");
		lst.add("Strings");
		lst.add("Vibration");
		lst.add("Quantum-fluctuations");
		lst.add("Spacetime");
		lst.add("Entanglement");
		lst.add("Quantum");
		lst.add("Weak boson");
		lst.add("Einsteinium");
		lst.add("Quantum-chemistry");
		lst.add("Deca");
		lst.add("Yocta");
		lst.add("Lindbergh's");
		lst.add("Third");
		lst.add("Boltzmann's");
		lst.add("Photo-electric");
		lst.add("Negative");
		lst.add("Gravity");
		lst.add("Anti-matter");
		lst.add("Photon");
		lst.add("Proton");
		lst.add("NP");
		lst.add("Neutron");
		lst.add("Classic");
		lst.add("Third-degree");
		lst.add("Multiverse");
		lst.add("Mechanics");
		lst.add("Phantom");
		lst.add("Drive");
		lst.add("Spin");
		lst.add("Fusion");
		lst.add("Thermonuclear");
		lst.add("Thermodynamics");
		lst.add("Decay");
		lst.add("Alpha");
		lst.add("Beta");
		lst.add("Gamma");
		lst.add("Dark matter");
		lst.add("Dark energy");
		lst.add("Vacuum energy");
		lst.add("Polarization");
		lst.add("Cloaking device");
		lst.add("Holographic");
		lst.add("Rotating");
		lst.add("Spring");
		lst.add("Pendulum");
		lst.add("Chaos");
		lst.add("Chaotic");
		lst.add("Rift");
		lst.add("Super symmetry");
		lst.add("Exiled");
		lst.add("Excitation");
		lst.add("Chromo dynamics");
		lst.add("Hyperverse");
		lst.add("Engineering");
		lst.add("Simulated");
		lst.add("Accelerator");
		lst.add("Tunneling");
		lst.add("Particle");
		lst.add("Computer");
		lst.add("Paradox");
		lst.add("Causality");
		lst.add("Lightspeed");
		lst.add("Field");
		lst.add("Potassium");
		lst.add("Anti");
		lst.add("Black hole");
		lst.add("White dwarf");
		lst.add("Supernova");
		lst.add("Tractor beam");
		lst.add("Newton");
		lst.add("Power");
		lst.add("Fabric");
		lst.add("Quadruple");
		lst.add("Polynomial");
		lst.add("Mononomial");
		lst.add("Infinity");
		lst.add("Googleplex");
		lst.add("Irrational");
		lst.add("Infinitesimal");
		lst.add("Continuum");
		lst.add("Measurement");
		lst.add("Helium");
		lst.add("Hydrogen");

		for (int i = 0; i < 5; i++) {
			System.out.println(output(lst, 5));
		}
	}

	public static String output(List<String> lst, int length) {
		List<String> temp = new ArrayList<>(lst);

		Random r = new Random();

		// Build output
		String output = "";
		for (int i = 0; i < length; i++) {
			// System.out.println(output);
			int pos = r.nextInt(temp.size());

			output += temp.get(pos);
			if (i < length - 1) {
				output += " ";
			}
			temp.remove(pos);
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
