package test.java.questao_6;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.questao_6.Questao6;

public class Questao6Test {
    /*
     * Mensalmente, a organização de moradores do bairro faz um sorteio cujos
     * bilhetes contêm números de 6 dígitos. O sorteio é baseado nos dois primeiros
     * números da loteria federal, sendo que o número vencedor no sorteio da
     * organização
     * é formado pelos três primeiros dígitos do segundo prêmio e os três últimos
     * dígitos
     * do primeiro prêmio da loteria federal. Por exemplo, se o primeiro prêmio
     * fosse 34.582
     * e o segundo 54.098, o número vencedor seria 540.582. Escreva um programa que
     * leia os
     * prêmios da loteria federal e retorna o número vencedor da organização.
     */
    @Test
    public void it_should_return_the_correct_winner_number() {
        int expectedWinnerNumber = 540582;
        int first = 34582;
        int last = 54098;

        Questao6 sut = new Questao6(first, last);
        int result = sut.execute();

        assertEquals("Deve retornar o número correto do vencedor", expectedWinnerNumber, result);
    }

    @Test
    // teste para valores com 3 digitos, deve ter o mesmo funcionamento
    public void it_should_works_the_same_for_inputs_with_only_3_digits() {
        int expectedWinnerNumber = 540582;
        int first = 582;
        int last = 540;

        Questao6 sut = new Questao6(first, last);
        int result = sut.execute();

        assertEquals("Deve retornar o número correto do vencedor", expectedWinnerNumber, result);
    }

    @Test
    public void it_should_count_the_number_of_digits_an_int_number_has() {
        int ex1 = 152;
        int ex2 = 56451;
        int ex3 = 0;
        int ex4 = 231213213;

        assertEquals(3, Questao6.numberOfDigits(ex1));
        assertEquals(5, Questao6.numberOfDigits(ex2));
        assertEquals(1, Questao6.numberOfDigits(ex3));
        assertEquals(9, Questao6.numberOfDigits(ex4));
    }

    @Test
    public void it_should_get_the_right_first_3_digits() {
        int ex1 = 152;
        int ex2 = 56451;
        int ex3 = 0;
        int ex4 = 231213213;

        Questao6 sut = new Questao6(0, ex1);
        assertEquals(152000, sut.getFirstThreeDigits());

        sut = new Questao6(0, ex2);
        assertEquals(564000, sut.getFirstThreeDigits());

        sut = new Questao6(0, ex3);
        assertEquals(0, sut.getFirstThreeDigits());

        sut = new Questao6(0, ex4);
        assertEquals(231000, sut.getFirstThreeDigits());
    }

    @Test
    public void it_should_get_the_right_last_3_digits() {
        int ex1 = 152;
        int ex2 = 56451;
        int ex3 = 0;
        int ex4 = 231213213;

        Questao6 sut = new Questao6(ex1, 0);
        assertEquals(152, sut.getLastThreeDigits());

        sut = new Questao6(ex2, 0);
        assertEquals(451, sut.getLastThreeDigits());

        sut = new Questao6(ex3, 0);
        assertEquals(0, sut.getLastThreeDigits());

        sut = new Questao6(ex4, 0);
        assertEquals(213, sut.getLastThreeDigits());
    }
}
