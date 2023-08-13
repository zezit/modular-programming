package main.java.questao_7;

/*
* Um algoritmo para multiplicação rápida por 11 de números de 2 dígitos
* funciona assim: para multiplicar 81 x 11, some os dígitos do número (8 + 1 =
* 9) e insira o resultado entre os dígitos (891). Se a soma der maior que 9,
* incremente o dígito da esquerda (vai-um): 56 x 11 = 616. Escreva um programa
* que efetue multiplicações por 11 usando este algoritmo.
*/
public class Questao7 {
    public static int execute(int input) {
        int left = input / 10;
        int right = input % 10;

        int sum = (left + right) > 9 ? (left + right) % 10 : left + right;
        int leftSum = (left + right) > 9 ? 1 + left : left;

        int ret = leftSum * 100 + (sum) * 10 + right;

        return ret;
    }
}
