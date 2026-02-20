package Application;

import java.util.Scanner;

import Entities.Person2;

public class OlderOlder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people are you going to type? ");
		int n = sc.nextInt();
		
		Person2[] vect = new Person2[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Data from the " + (i + 1) + "a person");
			System.out.print("name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			vect[i] = new Person2(name, age);
		}
		System.out.print("OLDEST PERSON: ");
		 
		Person2 oldest = vect[0];
		
		for (int i=1; i<vect.length; i++) {
			if (vect[i].getAge() > oldest.getAge()) {
				oldest = vect[i];
			}
		}
		
		 System.out.print(oldest.getName());
			
		
		sc.close();

	}

}
