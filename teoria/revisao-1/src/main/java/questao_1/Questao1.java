package main.java.questao_1;

import java.lang.reflect.Array;

/*
 * Escreva códigos Java para preencher um vetor de 6 números inteiros
 * a partir da entrada do usuário e, depois, inverter as posições dos
 * números do vetor. Por exemplo, se o vetor original era 4-8-15-16-23-42,
 * deve ficar 42-23-16-15-8-4 após a execução. Escreva um programa que
 * verifique a correção do seu código
 */
public class Questao1 {
    public static int[] execute(int[] input) {
        if (input.length == 0) {
            throw new Error("Necessário entrar dados");
        }

        int size = Array.getLength(input);
        int aux = -1;

        for (int i = 0; i < size / 2; i++) {
            aux = input[i];
            input[i] = input[size - i - 1];
            input[size - i - 1] = aux;
        }

        return input;
    }

    public static void enunciado() {
        System.out.println("Escreva códigos Java para preencher um vetor de 6 números inteiros");
        System.out.println("a partir da entrada do usuário e, depois, inverter as posições dos");
        System.out.println("números do vetor. Por exemplo, se o vetor original era 4-8-15-16-23-42,");
        System.out.println("deve ficar 42-23-16-15-8-4 após a execução. Escreva um programa que");
        System.out.println("verifique a correção do seu código");
    }

    public static void showResult() {
    }
}
