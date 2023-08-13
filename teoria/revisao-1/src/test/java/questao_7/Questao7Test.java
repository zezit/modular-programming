package test.java.questao_7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.questao_7.Questao7;

public class Questao7Test {
    /*
     * Um algoritmo para multiplicação rápida por 11 de números de 2 dígitos
     * funciona assim: para multiplicar 81 x 11, some os dígitos do número (8 + 1 =
     * 9) e insira o resultado entre os dígitos (891). Se a soma der maior que 9,
     * incremente o dígito da esquerda (vai-um): 56 x 11 = 616. Escreva um programa
     * que efetue multiplicações por 11 usando este algoritmo.
     */
    @Test
    public void it_should_multiply_81_by_11_correctly() {
        int expected = 891;
        int input = 81;

        int result = Questao7.execute(input);

        assertEquals("Deve multiplicar corretamente 81 por 11", expected, result);
    }

    @Test
    public void it_should_multiply_56_by_11_correctly() {
        int expected = 616;
        int input = 56;

        int result = Questao7.execute(input);

        assertEquals("Deve multiplicar corretamente 56 por 11", expected, result);
    }

    @Test
    public void it_should_multiply_99_by_11_correctly() {
        int expected = 1089;
        int input = 99;

        int result = Questao7.execute(input);

        assertEquals("Deve multiplicar corretamente 99 por 11", expected, result);
    }
}
