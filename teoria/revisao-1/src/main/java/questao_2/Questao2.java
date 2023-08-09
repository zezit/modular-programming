package main.java.questao_2;

import main.java.utils.Utils;

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
}
