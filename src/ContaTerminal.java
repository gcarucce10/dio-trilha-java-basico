import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // To do: Conhecer e importar a classe Scanner
        // Exibir mensagem ao usuário
        // Obter pela Scanner os valores digitados no terminal
        // Exibir a mensagem conta criada com sucesso

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("\nOlá, cliente " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + numeroAgencia + ", Conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
