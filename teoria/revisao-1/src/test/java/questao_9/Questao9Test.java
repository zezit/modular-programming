package test.java.questao_9;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.questao_9.Questao9;

public class Questao9Test {
    /*
     * Sabendo que 1º de janeiro de 2024 será uma segunda feira, escreva um método
     * que receba uma data e diga em qual dia da semana esta data acontecerá em
     * 2024. Escreva um programa principal para testar seu método.
     */

    @Test
    public void it_should_return_segunda_for_first_year_day() {
        String expecString = "segunda feira";
        Questao9 sut = Questao9.validate("01/01/2024");

        assertEquals("Deve retornar segunda feira", expecString, sut.weekDay());
    }

    @Test
    public void it_should_return_invalid_year() {
        String expecString = "Ano inválido";
        Questao9 sut = Questao9.validate("01/01/2023");

        assertEquals("Deve retornar Ano inválido", "", sut.weekDay());
        assertEquals("Deve retornar Ano inválido", expecString, sut.errorDayString());
    }

    @Test
    public void it_should_return_terca_for_second_year_day() {
        String expecString = "terça feira";
        Questao9 sut = Questao9.validate("02/01/2024");

        assertEquals("Deve retornar terça feira", expecString, sut.weekDay());
    }

    @Test
    public void it_should_return_quarta_for_third_year_day() {
        String expecString = "quarta feira";
        Questao9 sut = Questao9.validate("03/01/2024");

        assertEquals("Deve retornar quarta feira", expecString, sut.weekDay());
    }

    @Test
    public void it_should_return_quinta_for_fourth_year_day() {
        String expecString = "quinta feira";
        Questao9 sut = Questao9.validate("04/01/2024");

        assertEquals("Deve retornar quinta feira", expecString, sut.weekDay());
    }

    @Test
    public void it_should_return_sexta_for_fifth_year_day() {
        String expecString = "sexta feira";
        Questao9 sut = Questao9.validate("05/01/2024");

        assertEquals("Deve retornar sexta feira", expecString, sut.weekDay());
    }

    @Test
    public void it_should_return_sabado_for_sixth_year_day() {
        String expecString = "sábado";
        Questao9 sut = Questao9.validate("06/01/2024");

        assertEquals("Deve retornar sábado", expecString, sut.weekDay());
    }

    @Test
    public void it_should_return_domingo_for_seventh_year_day() {
        String expecString = "domingo";
        Questao9 sut = Questao9.validate("07/01/2024");

        assertEquals("Deve retornar domingo", expecString, sut.weekDay());
    }

    public void it_should_return_sexta_for_25_10_2024() {
        String expecString = "sexta feira";
        Questao9 sut = Questao9.validate("25/10/2024");

        assertEquals("Deve retornar sexta feira", expecString, sut.weekDay());
    }

}
