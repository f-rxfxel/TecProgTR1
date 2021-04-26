package trabalhos.periodo1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Trabalho01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");

		int opcao;
		double area;

		do {
			System.out.printf("  1 - Quadrado \n" + 
		              "  2 - Tri�ngulo \n" + 
		              "  3 - Trap�zio\n" + 
		              "  4 - C�rculo \n" +
		              "  9 - Sair \n" + 
					  "  -> Digite uma op��o: ");
			opcao = input.nextInt();

			switch (opcao) {

			case 1: // IN�CIO QUADRADO

				double base;
				double altura;

				System.out.printf("Digite o valor da base do quadrado: ");
				base = input.nextFloat();

				System.out.printf("Digite o valor da altura do quadrado: ");
				altura = input.nextFloat();

				area = base * altura;

				System.out.printf("A �rea de um quadrado de base " + base + " e altura " + altura + " � "
						+ df.format(area) + "\n");
				break; // FIM QUADRADO

			case 2: // IN�CIO TRI�NGULO

				System.out.printf("� um tri�ngulo equil�tero? Digite 1 para SIM e 2 para N�O: ");

				int trianguloEq;

				trianguloEq = input.nextInt();

				if (trianguloEq == 1) { // IN�CIO TRIN�NGULO EQUI�TERO

					double lado;

					System.out.printf("Digite o valor do lado do tri�gulo equil�tero: ");
					lado = input.nextDouble();

					area = (lado * lado * Math.sqrt(3)) / 4;

					System.out.printf(
							"A �rea de um tri�gulo equil�tero de lado " + lado + " � " + df.format(area) + "\n");
				} // FIM TRIN�NGULO EQUI�TERO

				else if (trianguloEq == 2) { // IN�CIO TRI�NNGULOS ESCALENO E IS�CELES

					System.out.printf("Digite o valor da base do tri�gulo: ");
					base = input.nextFloat();

					System.out.printf("Digite o valor da altura do tri�gulo: ");
					altura = input.nextFloat();

					area = base * altura / 2;

					System.out.printf("A �rea de um tri�gulo de base " + base + " e de altura " + altura + " � "
							+ df.format(area) + "\n");
				} // FIM TRI�NNGULOS ESCALENO E IS�CELES

				else { // IN�CIO OP��O INV�LIDA

					System.out.printf("Op��o inv�lida! Tente novamente: \n");
				} // FIM OP��O INV�LIDA
				break;

			case 3: // IN�CIO TRAP�ZIO

				double base_M;
				double base_m;

				System.out.printf("Digite o valor da base maior do trap�zio: ");
				base_M = input.nextFloat();

				System.out.printf("Digite o valor da base menor do trap�zio: ");
				base_m = input.nextFloat();

				System.out.printf("Digite o valor da altura do trap�zio: ");
				altura = input.nextFloat();

				area = (base_M + base_m) * altura / 2;

				System.out.printf("A �rea de um trap�zio de base maior " + base_M + ", base menor " + base_m
						+ " e altura " + altura + " � " + df.format(area) + "\n");
				break; // FIM TRAP�ZIO

			case 4: // IN�CIO C�RCULO

				double raio;

				System.out.printf("Digite o valor do raio do c�rculo: ");
				raio = input.nextFloat();

				area = 3.14 * raio * raio;

				System.out.printf("A �rea de um c�rculo de raio " + raio + " � " + df.format(area) + "\n");
				break; // FIM C�RCULO

			case 9: // IN�CIO FIM (??)

				System.out.printf("Fim do programa. V� beber uma �gua!");
				input.close();
				break; // FIM FIM (?????)

			default: // IN�CIO OP��O INV�LIDA

				System.out.printf("Op��o inv�lida! Digite um n�mero de 1 a 4, ou 9 para sair. \n");
				break;
			} // FIM OP��O INV�LIDA
		} while (opcao > 9 || opcao < 9); // U�
	}
}