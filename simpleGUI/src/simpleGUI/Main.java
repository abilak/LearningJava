package simpleGUI;

import javax.swing.JOptionPane; // import JOptioPaneClass

public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: ")); // like python int(input())
		JOptionPane.showMessageDialog(null, "You are "+age+" years old.");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(in cm): ")); // like python int(input())
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall.");

	}

}
