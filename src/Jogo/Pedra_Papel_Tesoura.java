package Jogo;

import java.util.Scanner;

public class Pedra_Papel_Tesoura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int computador;
		System.out.println("PEDRA PAPEL TESOURA\n");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("Digite a opção desejada:");
		int jogador = teclado.nextInt();
		System.out.println("");

		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}

		computador = (int) (Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA\n");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL\n");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA\n");
			break;
		}
		if (jogador == computador) {
			System.out.println("EMPATE");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("JOGADOR VENCEU!!");
			} else {
				System.out.println("COMPUTADOR VENCEU :(");
			}
		}
	}

}
