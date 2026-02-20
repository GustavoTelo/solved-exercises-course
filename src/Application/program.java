package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.DadosPessoas;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		DadosPessoas[] dados = new DadosPessoas[n];
		
		for (int i=0; i<dados.length; i++) {
			System.out.print("altura da " + (i+1) + "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("genero da " + (i+1) + "a pessoa: ");
			sc.nextLine();
			char genero = sc.nextLine().charAt(0);
			dados[i] = new DadosPessoas(altura, genero)	;
		}

		DadosPessoas menorAltura = dados[0];
		
		for (int i=1; i<dados.length; i++) {
			if (dados[i].getAltura() < menorAltura.getAltura()) {
				menorAltura = dados[i];	
			}
		}
		System.out.println("Menor altura = " + menorAltura.getAltura());
		
		DadosPessoas maiorAltura = dados[0];
		
		for (int i=1; i<dados.length; i++) {
			if(dados[i].getAltura() > maiorAltura.getAltura()) {
				maiorAltura = dados[i];
			}
		}
		System.out.println("Maior altura = " + maiorAltura.getAltura());
		
		int count = 0, countM = 0;
		double somaAltura = 0.0, media = 0.0;
		
		for (int i=0; i<dados.length; i++) {
			if(dados[i].getGenero() == 'f') {
				count +=1;	
				somaAltura += dados[i].getAltura();
			}
			else{
				countM +=1;
			}
		}
		
		media = somaAltura / count;
		System.out.println("media das alturas das mulheres = " + String.format("%.2f", media));
		
		System.out.println("numero de homens = " + countM );
		sc.close();

	}

}
