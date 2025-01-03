import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após o número da conta

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final
        String mensagem = "Olá " + nomeCliente + 
                          ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                          ", conta " + numero + 
                          " e seu saldo R$ " + String.format("%.2f", saldo) + " já está disponível para saque.";
        System.out.println(mensagem);

        scanner.close();
    }
}