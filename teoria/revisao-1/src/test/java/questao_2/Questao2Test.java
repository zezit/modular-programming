package test.java.questao_2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import main.java.questao_2.Questao2;

public class Questao2Test {

    @Test
    public void it_should_return_the_sum_of_all_neiboors() {
        int input[] = {1, 50, 23, 6, 45, 12, 85, 21};
        int expected[] = {51, 29, 57, 106};

        int result[] = Questao2.execute(input);

        assertArrayEquals("deve retornar a soma dos vizinhos", expected, result);
    }

    // caso for um tamanho impar no array de entrada, o ultimo elemento deve ser somado consigo mesmo
    @Test
    public void it_should_return_the_sum_of_all_neiboors_even_if_the_array_size_is_odd() {
        int input[] = {1, 50, 23, 6, 45, 12, 85, 21, 10};
        int expected[] = {51, 29, 57, 106, 20};

        int result[] = Questao2.execute(input);

        assertArrayEquals("deve retornar a soma dos vizinhos para quantidade impar", expected, result);
    }
}
