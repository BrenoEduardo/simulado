package simulado2;

import java.util.Locale;
import java.util.Scanner;

public class simulado2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int digi, ep;
		char dv, hm;
		
		// Leitura de escolaridade
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.printf("Digite uma opção: ");
		digi = sc.nextInt();
		
		//Leitura de outros dados
		
		System.out.println();
		System.out.printf("Você tem quantos anos de experiência profissional? ");
		ep = sc.nextInt();
		System.out.printf("Você tem disponibilidade para viajar (S/N)? ");
		dv = sc.next().charAt(0);
		System.out.printf("Você tem habilitação de motorista (S/N)? ");
		hm = sc.next().charAt(0);
		
		//Escolaridade e experiencia
		
		System.out.println();
		if(digi==1) {
			System.out.println("Pontos por escolaridade: 10");
		}
		else if(digi==2) {
			System.out.println("Pontos por escolaridade: 20");
		}
		else if(digi==3) {
			System.out.println("Pontos por escolaridade: 30");
		}
		else {
			System.out.println("Pontos por escolaridade: 40");
		}
		
		if(ep==0) {
			System.out.println("Pontos por experiência: 0");
		}
		else if(ep>0 && ep<=2) {
			System.out.println("Pontos por experiência: 10");
		}
		else if(ep>2 && ep<=5) {
			System.out.println("Pontos por experiência: 20");
		}
		else {
			System.out.println("Pontos por experiência: 40");
		}
		
		
		
		sc.close();

	}

}
