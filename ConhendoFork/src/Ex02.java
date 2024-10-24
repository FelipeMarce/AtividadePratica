/*Contagem de Dígitos: Leia um número inteiro e conte quantos dígitos ele possui.*/

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();

		if (num < 10 && num > -10) {
			System.out.println("O número digitado possui 1 digito.");
		} else if (num >= 10 && num < 100 || num <= -10 && num > -100) {
			System.out.println("O número digitado possui 2 digito.");
		} else if (num >= 100 && num < 1000 || num <= -100 && num > -1000) {
			System.out.println("O número digitado possui 3 digito.");
		} else if (num >= 1000 && num < 10000 || num <= -1000 && num > -10000) {
			System.out.println("O número digitado possui 4 digito.");
		} else if (num >= 10000 || num <= -10000) {
			System.out.println("O número digitado possui 5 ou mais digito.");
		}
		sc.close();

	}

}
