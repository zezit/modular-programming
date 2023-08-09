package test.java.questao_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.questao_3.Questao3;

public class Questao3Test {
    @Test
    public void it_should_print_a_rectangle() {
        String expectedString = "XXXXX\nX   X\nXXXXX\n";
        String result = Questao3.execute(5, 3);
        System.out.println(result);

        assertEquals("deve imprimir um retangulo 5x3", expectedString, result);
    }

    @Test
    // both inputs at zero
    public void it_should_print_void() {
        String expectedString = "";
        String result = Questao3.execute(0, 0);
        System.out.println(result);

        assertEquals("deve imprimir nada", expectedString, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_throw_for_negative_numbers() {
        Questao3.execute(-1, -1);
    }
}
