package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class Subtracao {

	public static void main(String[] args) {

		String strValor1, strValor2;
		int valor1, valor2, subtracao;
		
		strValor1 = JOptionPane.showInputDialog("Digite o valor 1.");
		strValor2 = JOptionPane.showInputDialog("Digite o valor 2");
		
		valor1 = Integer.parseInt(strValor1);
		valor2 = Integer.parseInt(strValor2);
		
		subtracao = valor1 - valor2;
		
		if(valor1 <= valor2) {
			subtracao = valor2 - valor1;
		} else {
			subtracao = valor1 - valor2;
		}
		
		JOptionPane.showMessageDialog(null, "O resultado da subtração é " + subtracao + ".");

		
		
	}

}
