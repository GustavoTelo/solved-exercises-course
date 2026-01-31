	package Application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		double soma = 0.0;
		System.out.print("VALORES = ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + " ");
			soma += vect[i];
		}
		System.out.println();
		System.out.print("SOMA = " + String.format("%.2f", soma));
		double avg = soma / vect.length;
		System.out.println();
		System.out.println("MEDIA = " + String.format("%.2f", avg));
		
		
		sc.close();

	}

}
