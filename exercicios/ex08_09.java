/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Faça um programa que receba o valor da venda, escolha a
        condição de pagamento no menu e mostre o total da venda final
        conforme condições a seguir:
        Venda a Vista - desconto de 10%
        Venda a Prazo 30 dias - desconto de 5%
        Venda a Prazo 60 dias - mesmo preço
        Venda a Prazo 90 dias - acréscimo de 5%
        Venda com cartão de débito - desconto de 8%
        Venda com cartão de crédito - desconto de 7%
 * Data:11/05/2023
 */

import java.util.Scanner;

public class ex08_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da venda: ");
        double valorVenda = scanner.nextDouble();

        System.out.println("Escolha a condição de pagamento:");
        System.out.println("1 - Venda à vista");
        System.out.println("2 - Venda a prazo 30 dias");
        System.out.println("3 - Venda a prazo 60 dias");
        System.out.println("4 - Venda a prazo 90 dias");
        System.out.println("5 - Venda com cartão de débito");
        System.out.println("6 - Venda com cartão de crédito");
        System.out.print("Opção: ");
        int opcaoPagamento = scanner.nextInt();

        double totalVenda;

        switch (opcaoPagamento) {
            case 1 -> totalVenda = valorVenda - (valorVenda * 0.1);
            case 2 -> totalVenda = valorVenda - (valorVenda * 0.05);
            case 3 -> totalVenda = valorVenda;
            case 4 -> totalVenda = valorVenda + (valorVenda * 0.05);
            case 5 -> totalVenda = valorVenda - (valorVenda * 0.08);
            case 6 -> totalVenda = valorVenda - (valorVenda * 0.07);
            default -> {
                totalVenda = valorVenda;
                System.out.println("Opção inválida. Sem desconto/acréscimo aplicado.");
            }
        }

        System.out.println("Total da venda: R$ " + totalVenda);
    }
}
