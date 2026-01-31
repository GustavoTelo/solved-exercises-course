package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Person;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Person[] vect = new Person[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:" );
			System.out.print("Nome: ");
			sc.nextLine();	
			String name = sc.nextLine();
			System.out.print("Idade:");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new Person(name, age, height);
		}
		
		double soma_altura = 0.0;
		for (int i=0; i<vect.length; i++) {
			soma_altura += vect[i].getHeight();
		}
		System.out.println();
		double altura_media = soma_altura / vect.length;
		
		System.out.println("Altura media: " + String.format("%.2f", altura_media));
		
		int count = 0;
			
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getAge() < 16) {
				count += 1;
			}
		}
		
		double menor_idade = (double) count / vect.length * 100.0;
		System.out.println("pessoas com menos de 16 anos: " + String.format("%.1f", menor_idade) + "%");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();

	}

}
