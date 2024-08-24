import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Informe o nome do cliente");
		String nomeCliente = scanner.nextLine();

		System.out.println("Informe o número da agencia");
		String agencia = scanner.nextLine();

		System.out.println("Informe a conta corrente");
		int contaCorrente = scanner.nextInt();
		
		System.out.println("Informe o saldo da conta");
		double saldo = scanner.nextDouble();
		
		System.out.println();
		System.out.print("Ola " + nomeCliente);
		System.out.print(", obrigado por criar uma conta em nosso banco");
		System.out.print(", sua agencia é " + agencia + ", conta " + contaCorrente);
		System.out.println(" e seu saldo " + saldo + " já está disponível para saque.");
		
	}

}
