package test.java.questao_1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import main.java.questao_1.Questao1;

public class Questao1Test {
    @Test
    public void it_sould_invert_array() {
        int[] input = { 4, 8, 15, 16, 23, 42 };
        int[] expected = { 42, 23, 16, 15, 8, 4 };
        int[] result = Questao1.execute(input);

        assertArrayEquals("deve inverter o array de entrada", expected, result);
    }

    @Test(expected = Error.class)
    public void it_should_throw_if_input_is_empty() {
        int[] input = {};
        Questao1.execute(input);
    }
}
