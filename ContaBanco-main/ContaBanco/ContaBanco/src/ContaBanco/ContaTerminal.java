package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int Numero;
		String Agencia;
		String nomeCliente;
		double Saldo;

		System.out.println("---------------CONTA BANCÁRIA---------------");
		System.out.println();
		System.out.println("Por favor, digite o número da Conta:");
		Numero = sc.nextInt();

		System.out.println("Agora digite o número da Agência:");
		Agencia = sc.next();

		System.out.println("Me informe seu nome:");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("Agora me informa seu saldo atual:");
		Saldo = sc.nextDouble();

		System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ " para saque.", nomeCliente, Agencia, Numero, Saldo);

		sc.close();
	}

}
