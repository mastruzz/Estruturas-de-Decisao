/* Nome do Aluno: Mateus Oliveira de Macedo
 * RA:12523122971
 * Nome do Programa: Construa um programa que receba como entrada três valores A, B
e C e os imprima em ordem crescente.
 * Data:11/05/2023
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int valorA = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int valorB = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int valorC = scanner.nextInt();

        int[] valores = {valorA, valorB, valorC};
        Arrays.sort(valores);

        System.out.println("Valores em ordem crescente: " + Arrays.toString(valores));
    }

    }