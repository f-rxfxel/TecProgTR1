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
		              "  2 - Triângulo \n" + 
		              "  3 - Trapézio\n" + 
		              "  4 - Círculo \n" +
		              "  9 - Sair \n" + 
					  "  -> Digite uma opção: ");
			opcao = input.nextInt();

			switch (opcao) {

			case 1: // INÍCIO QUADRADO

				double base;
				double altura;

				System.out.printf("Digite o valor da base do quadrado: ");
				base = input.nextFloat();

				System.out.printf("Digite o valor da altura do quadrado: ");
				altura = input.nextFloat();

				area = base * altura;

				System.out.printf("A área de um quadrado de base " + base + " e altura " + altura + " é "
						+ df.format(area) + "\n");
				break; // FIM QUADRADO

			case 2: // INÍCIO TRIÂNGULO

				System.out.printf("É um triângulo equilátero? Digite 1 para SIM e 2 para NÃO: ");

				int trianguloEq;

				trianguloEq = input.nextInt();

				if (trianguloEq == 1) { // INÍCIO TRINÂNGULO EQUIÁTERO

					double lado;

					System.out.printf("Digite o valor do lado do triâgulo equilátero: ");
					lado = input.nextDouble();

					area = (lado * lado * Math.sqrt(3)) / 4;

					System.out.printf(
							"A área de um triâgulo equilátero de lado " + lado + " é " + df.format(area) + "\n");
				} // FIM TRINÂNGULO EQUIÁTERO

				else if (trianguloEq == 2) { // INÍCIO TRIÂNNGULOS ESCALENO E ISÓCELES

					System.out.printf("Digite o valor da base do triâgulo: ");
					base = input.nextFloat();

					System.out.printf("Digite o valor da altura do triâgulo: ");
					altura = input.nextFloat();

					area = base * altura / 2;

					System.out.printf("A área de um triâgulo de base " + base + " e de altura " + altura + " é "
							+ df.format(area) + "\n");
				} // FIM TRIÂNNGULOS ESCALENO E ISÓCELES

				else { // INÍCIO OPÇÃO INVÁLIDA

					System.out.printf("Opção inválida! Tente novamente: \n");
				} // FIM OPÇÃO INVÁLIDA
				break;

			case 3: // INÍCIO TRAPÉZIO

				double base_M;
				double base_m;

				System.out.printf("Digite o valor da base maior do trapézio: ");
				base_M = input.nextFloat();

				System.out.printf("Digite o valor da base menor do trapézio: ");
				base_m = input.nextFloat();

				System.out.printf("Digite o valor da altura do trapézio: ");
				altura = input.nextFloat();

				area = (base_M + base_m) * altura / 2;

				System.out.printf("A área de um trapézio de base maior " + base_M + ", base menor " + base_m
						+ " e altura " + altura + " é " + df.format(area) + "\n");
				break; // FIM TRAPÉZIO

			case 4: // INÍCIO CÍRCULO

				double raio;

				System.out.printf("Digite o valor do raio do círculo: ");
				raio = input.nextFloat();

				area = 3.14 * raio * raio;

				System.out.printf("A área de um círculo de raio " + raio + " é " + df.format(area) + "\n");
				break; // FIM CÍRCULO

			case 9: // INÍCIO FIM (??)

				System.out.printf("Fim do programa. Vá beber uma água!");
				input.close();
				break; // FIM FIM (?????)

			default: // INÍCIO OPÇÃO INVÁLIDA

				System.out.printf("Opção inválida! Digite um número de 1 a 4, ou 9 para sair. \n");
				break;
			} // FIM OPÇÃO INVÁLIDA
		} while (opcao > 9 || opcao < 9); // Ué
	}
}