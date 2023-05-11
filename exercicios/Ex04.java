import java.util.Scanner;

/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa:
        Faça um programa que leia o nome, o sobrenome, a idade, em
        anos, e a naturalidade (cidade de nascimento) de uma pessoa.
        Depois, o programa deve dar a seguinte opção “Deseja
        visualizar dados completos?”. Se o caractere digitado pelo
        usuário for ‘S’ o programa deve imprimir na tela Nome,
        Sobrenome, idade e naturalidade. Se o caractere digitado pelo
        usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
        o caractere não for nenhuma das outras opções acima o programa
        deve imprimir “Digitação errada. Tente Novamente”
 * Data:11/05/2023
 */
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite a idade em anos: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a naturalidade: ");
        String naturalidade = scanner.nextLine();

        System.out.print("Deseja visualizar os dados completos? (S/N): ");
        char opcao = Character.toUpperCase(scanner.nextLine().charAt(0));

        if (opcao == 'S') {
            System.out.println("Nome: " + nome);
            System.out.println("Sobrenome: " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N') {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        } else {
            System.out.println("Digitação errada. Tente novamente.");
        }
    }
}
