package simulado2;

import java.util.Locale;
import java.util.Scanner;

public class simulado2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int digi;
		
		// Leitura de escolaridade
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.printf("Digite uma op��o: ");
		digi = sc.nextInt();
		
		
		
		sc.close();

	}

}
