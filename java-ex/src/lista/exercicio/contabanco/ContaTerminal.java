package lista.exercicio.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);


        System.out.println("Qual seu nome? ");
        String nome_cliente = scanner.next();
        scanner.next();
        System.out.println("Por favor digite sua agencia! ");
        String agencia = scanner.next();

        System.out.println("Por favor digite sua conta! ");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite seu saldo! ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá "+nome_cliente+", obrigado por criar sua conta no nosso banco, sua agencia é "+agencia+". conta "+numero+", e seu saldo "+saldo+" já disponivel para saque.");



    }
}