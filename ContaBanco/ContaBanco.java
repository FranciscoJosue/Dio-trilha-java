import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double saldo = 51.78;

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();

        System.out.println("Digite a sua conta do banco: ");
        int conta = scan.nextInt();

        while (String.valueOf(conta).length() != 4) {
            System.out.println("A conta de banco so tem quatro digitos!");
            System.out.println("Digite novamente:");
            conta = scan.nextInt();

        }

        System.out.println("Digite a sua agencia:");

        String agencia = scan.next();

        while (!agencia.matches("\\d{3}-\\d{1}")) {
            System.out.println("Sua agencia precisa conter quatro digitos, sendo que o ultimo precisa separar por '-' ");
            System.out.println("Digite novamente:");
            agencia = scan.next();
        }

        System.out.println("Nome do cliente: " + nomeCompleto);
        System.out.println("Sua conta é: " + conta);
        System.out.println("Sua agencia é: " + agencia);
        System.out.println("Seu saldo bancário é: " + saldo);
    }
}
