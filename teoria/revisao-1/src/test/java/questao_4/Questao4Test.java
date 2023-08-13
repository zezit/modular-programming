package test.java.questao_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.questao_4.Questao4;

public class Questao4Test {
    @Test
    public void it_should_return_the_inverted_string() {
        String input = "Hello World";
        String expected = "dlroW olleH";

        Questao4 sut = new Questao4();
        Boolean result = sut.execute(input);

        assertTrue(result);
        assertEquals(expected, sut.getResult());
    }

    @Test
    public void it_should_return_null_if_string_is_fim() {
        String input = "fim";

        Questao4 sut = new Questao4();
        Boolean result = sut.execute(input);

        assertNull("Deve ser null com a string 'fim'", sut.getResult());
        assertFalse("Deve retornar falso com a string 'fim'", result);
    }

}
