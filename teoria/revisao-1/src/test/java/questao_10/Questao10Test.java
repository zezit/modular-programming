package test.java.questao_10;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import main.java.questao_10.Questao10;

public class Questao10Test {
    /*
     * Refaça o exercício 02, sendo que os dados serão lidos de um arquivo texto. O
     * arquivo texto pode ter várias linhas e cada linha representa um vetor a ser
     * utilizado pelo método. O separador usado é ponto e vírgula. Por exemplo:
     * 
     * 4;8;15;4;15;16;23;42
     * 7;11;13;17;29;23;29;31
     * 6;5;4;3;2;1
     */
    /*
     * Escreva códigos Java que leiam um vetor de inteiros e criem outro vetor,
     * contendo a soma de cada par de vizinhos do vetor original. Por exemplo,
     * se o vetor original era 4-8-15-16-23-42, o retorno deve ser um vetor 12-31-65
     * (ou seja, 4+8, 15+16 e 23+42). Caso o vetor tenha tamanho ímpar, o último
     * número deve ser somado consigo mesmo. Para ler o vetor, pode aproveitar o
     * método do exercício 02. Escreva um programa que execute e teste seu código..
     */

    @Test
    public void it_should_read_the_vector_in_the_right_way() {
        String exampleUserInput = "4;8;15;16;23;42";
        int[] expectedOutput = { 4, 8, 15, 16, 23, 42 };

        int[] intArrayInput = Questao10.convertString(exampleUserInput);
        assertArrayEquals("Deve retornar o vertor de inteiros corretamente convertido", expectedOutput, intArrayInput);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_throws_if_input_is_not_accorddly_with_the_template() {
        String exampleUserInputInvalid = "4;8;15,16;23;42";
        Questao10.convertString(exampleUserInputInvalid);
    }

    @Test
    public void it_should_return_the_neighboors_array_sum_correctly() {
        String exampleUserInput = "4;8;15;16;23;42";
        int[] expectedOutput = { 12, 31, 65 };

        int[] intArrayInput = Questao10.convertString(exampleUserInput);
        int[] result = Questao10.execute(intArrayInput);
        assertArrayEquals("Deve retornar o vertor de inteiros corretamente convertido", expectedOutput, result);
    }
}
