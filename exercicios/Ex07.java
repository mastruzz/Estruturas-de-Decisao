import java.util.Scanner;

/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Crie um programa que lê um número entre 1 e 12, correspondendo
        a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
        Ao final, o programa deve imprimir uma mensagem identificando,
        com base no número digitado, o nome do mês e a estação.
        Exemplo para o mês 1: "Mês: Janeiro – Estação: Verão"
 * Data:11/05/2023
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 12 que corresponde ao mes do ano: ");
        int numeroMes = scanner.nextInt();

        String nomeMes;
        String estacao;

        switch (numeroMes) {
            case 1 -> {
                nomeMes = "Janeiro";
                estacao = "Verão";
            }
            case 2 -> {
                nomeMes = "Fevereiro";
                estacao = "Verão";
            }
            case 3 -> {
                nomeMes = "Março";
                estacao = "Outono";
            }
            case 4 -> {
                nomeMes = "Abril";
                estacao = "Outono";
            }
            case 5 -> {
                nomeMes = "Maio";
                estacao = "Outono";
            }
            case 6 -> {
                nomeMes = "Junho";
                estacao = "Inverno";
            }
            case 7 -> {
                nomeMes = "Julho";
                estacao = "Inverno";
            }
            case 8 -> {
                nomeMes = "Agosto";
                estacao = "Inverno";
            }
            case 9 -> {
                nomeMes = "Setembro";
                estacao = "Primavera";
            }
            case 10 -> {
                nomeMes = "Outubro";
                estacao = "Primavera";
            }
            case 11 -> {
                nomeMes = "Novembro";
                estacao = "Primavera";
            }
            case 12 -> {
                nomeMes = "Dezembro";
                estacao = "Verão";
            }
            default -> {
                nomeMes = "Inválido";
                estacao = "Inválida";
            }
        }

        System.out.println("Mês: " + nomeMes + " - Estação: " + estacao);
    }
}
