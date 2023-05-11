/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa: 1. Faça um programa que leia dois números A e B e imprima o maior
deles.
 * Data:11/05/2023
 */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número A: ");
        int numeroA = scanner.nextInt();

        System.out.print("Digite o número B: ");
        int numeroB = scanner.nextInt();

        int maiorNumero = Math.max(numeroA, numeroB);

        if (maiorNumero == numeroA){
            System.out.println("O maior é o numero A: " + maiorNumero);
        }else {
            System.out.println("O maior é o numero B: " + maiorNumero);
        }
    }
}