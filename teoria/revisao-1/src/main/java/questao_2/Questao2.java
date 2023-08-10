package main.java.questao_2;

import main.java.utils.Utils;

/*
 * Escreva códigos Java que leiam um vetor de inteiros e criem outro vetor, 
 * contendo a soma de cada par de vizinhos do vetor original. Por exemplo, 
 * se o vetor original era 4-8-15-16-23-42, o retorno deve ser um vetor 12-31-65 
 * (ou seja, 4+8, 15+16 e 23+42). Caso o vetor tenha tamanho ímpar, o último 
 * número deve ser somado consigo mesmo. Para ler o vetor, pode aproveitar o 
 * método do exercício 02. Escreva um programa que execute e teste seu código..
*/
public class Questao2 {

    public static int[] execute(int[] input) {
        Utils utils = new Utils();
        int size = input.length;
        int[] result = new int[utils.isEven(size) ? size / 2 : size / 2 + 1];

        for (int i = 0, j = 0; i < size - 1; i = i + 2, j++) {
            result[j] = input[i] + input[i + 1];
        }

        if (!utils.isEven(size)) {
            result[result.length - 1] = input[size - 1] * 2;
        }

        return result;
    }

    public static void enunciado(){
        System.out.println("Escreva códigos Java que leiam um vetor de inteiros e criem outro vetor, ");
        System.out.println("contendo a soma de cada par de vizinhos do vetor original. Por exemplo, ");
        System.out.println("se o vetor original era 4-8-15-16-23-42, o retorno deve ser um vetor 12-31-65 ");
        System.out.println("(ou seja, 4+8, 15+16 e 23+42). Caso o vetor tenha tamanho ímpar, o último ");
        System.out.println("número deve ser somado consigo mesmo. Para ler o vetor, pode aproveitar o ");
        System.out.println("método do exercício 02. Escreva um programa que execute e teste seu código..");
    }
}
