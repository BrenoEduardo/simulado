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
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.printf("Digite uma op��o: ");
		digi = sc.nextInt();
		
		//Leitura de outros dados
		
		System.out.println();
		System.out.printf("Voc� tem quantos anos de experi�ncia profissional? ");
		ep = sc.nextInt();
		System.out.printf("Voc� tem disponibilidade para viajar (S/N)? ");
		dv = sc.next().charAt(0);
		System.out.printf("Voc� tem habilita��o de motorista (S/N)? ");
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
			System.out.println("Pontos por experi�ncia: 0");
		}
		else if(ep>0 && ep<=2) {
			System.out.println("Pontos por experi�ncia: 10");
		}
		else if(ep>2 && ep<=5) {
			System.out.println("Pontos por experi�ncia: 20");
		}
		else {
			System.out.println("Pontos por experi�ncia: 40");
		}
		
		//Resultado final
		
		System.out.println();
		if(ep>5 && (dv=='S' || dv=='s') && digi>=3) {
			System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargo(s):");
			System.out.println("GERENTE");
			System.out.printf("ANALISTA");
		}
		else if(digi>=3 && ep>2 && (hm=='s' || hm=='S')) {
			System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargo(s):");
			System.out.println("ASSISTENTE");
			System.out.printf("GERENTE");
		}
		else if(ep>5 && (dv=='s' || dv=='S') && digi>=3 && (hm=='s' || hm=='S')) {
			System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargo(s):");
			System.out.println("ASSISTENTE");
			System.out.printf("ANALISTA");
		}
		else if(ep>5 && (dv=='s' || dv=='S') && digi>=3) {
			System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargo(s):");
			System.out.printf("ANALISTA");
		}
		else if(ep>2 && digi>=3) {
			System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargo(s):");
			System.out.printf("GERENTE");
		}
		else if(digi>=2 && (hm=='S' || hm=='s')){
			System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargo(s):");
			System.out.printf("ASSISTENTE");
		}

		else {
			System.out.printf("Infelizmente seu perfil n�o atende a empresa");
		}
		sc.close();

	}

}
