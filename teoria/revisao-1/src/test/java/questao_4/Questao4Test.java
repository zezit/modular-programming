package test.java.questao_4;

import org.junit.Test;

import main.java.questao_4.Questao4;

public class Questao4Test {
    @Test
    public void it_should_return_the_inverted_string() {
        String input = "Hello World";
        String expected = "dlroW olleH";

        String result = Questao4.execute(input);

        assert result.equals(expected);
    }

    @Test
    public void it_should_return_null_if_string_is_fim(){
        String input = "fim";
        String expected = null;

        String result = Questao4.execute(input);

        assert result == expected;
    }

}
