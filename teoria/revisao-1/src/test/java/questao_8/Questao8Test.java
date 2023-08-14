package test.java.questao_8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.questao_8.Questao8;

public class Questao8Test {
    /*
     * Escreva um método que verifique se uma data é válida, a partir de um dado
     * recebido do usuário no formato DD/MM/AAAA. Se a data for inválida, informe ao
     * usuário onde está o erro.
     */
    @Test
    public void it_should_validate_correct_date() {
        String date = "01/01/2021";
        Questao8 sut = Questao8.isValid(date);
        assertEquals("Data válida true", true, sut.valid());
        assertEquals("Data válida sem mensagem de erro", "", sut.error());
    }

    @Test
    public void it_should_return_error_message_when_date_is_null_or_empty() {
        String date = "";
        Questao8 sut = Questao8.isValid(date);
        assertEquals("Data inválida false", false, sut.valid());
    }

    @Test
    public void it_should_return_error_message_when_month_is_invalid() {
        String date = "01/13/2021";
        Questao8 sut = Questao8.isValid(date);
        assertEquals("Data inválida false", false, sut.valid());
        assertEquals("Data inválida com mensagem de erro",
                "Mês inválido, mês deve estar entre 1 e 12\n01/13/2021\n    ^\n", sut.error());
    }

    @Test
    public void it_should_return_error_message_when_year_is_invalid() {
        String date = "32/01/-1";
        Questao8 sut = Questao8.isValid(date);
        assertEquals("Data inválida false", false, sut.valid());
    }

    @Test
    public void it_should_return_error_message_when_day_is_less_than_1_or_bigger_than_31() {
        String date = "32/01/2021";
        Questao8 sut = Questao8.isValid(date);
        assertEquals("Data inválida false", false, sut.valid());
        assertEquals("Data inválida com mensagem de erro",
                "Dia inválido, dia deve estar entre 1 e 31\n" + date + "\n    ^\n", sut.error());
    }

    @Test
    public void it_should_return_error_message_when_day_is_not_valid_for_the_month() {
        String date = "31/04/2021";
        Questao8 sut = Questao8.isValid(date);
        assertEquals("Data inválida false", false, sut.valid());
        assertEquals("Data inválida com mensagem de erro",
                "Dia inválido, dia deve estar entre 1 e 30\n" + date + "\n ^\n", sut.error());
    }

    @Test
    public void it_should_return_error_message_when_day_is_not_valid_for_the_month_in_leap_year() {
        String date = "30/02/2020";
        Questao8 sut = Questao8.isValid(date);
        assertEquals("Data inválida false", false, sut.valid());
        assertEquals("Data inválida com mensagem de erro",
                "Dia inválido, dia deve estar entre 1 e 29\n" + date + "\n ^\n", sut.error());
    }

    @Test
    public void it_should_return_error_message_when_day_is_not_valid_for_the_month_in_non_leap_year() {
        String date = "29/02/2021";
        Questao8 sut = Questao8.isValid(date);
        assertEquals("Data inválida false", false, sut.valid());
        assertEquals("Data inválida com mensagem de erro",
                "Dia inválido, dia deve estar entre 1 e 28\n" + date + "\n ^\n", sut.error());
    }
}
