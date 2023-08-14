package test.java.questao_11;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.questao_11.Questao11;
import main.java.questao_8.Questao8;

public class Questao11Test {
    /*
     * Refaça o exercício 08, adicionando a capacidade de ler várias datas de um
     * arquivo texto. O arquivo conterá, em sua primeira linha, o número de datas
     * das linhas seguintes. Por exemplo,
     * 
     * 4
     * 12/02/2013
     * 14/11/2019
     * 31/04/2020
     * 26/01/2021
     */

    /*
     * Escreva um método que verifique se uma data é válida, a partir de um dado
     * recebido do usuário no formato DD/MM/AAAA. Se a data for inválida, informe ao
     * usuário onde está o erro.
     */

    @Test
    public void it_should_read_the_correct_number_or_dates_from_the_string() {
        String dates = "4\n12/02/2013\n14/11/2019\n31/04/2020\n26/01/2021";
        String[] numberOfDates = Questao11.convertString(dates);
        assertEquals("Deve retornar um array de datas em string com exatamente o tamanho esperado", 4,
                numberOfDates.length);
    }

    @Test
    public void it_should_return_true_for_all_if_all_dates_are_valid() {
        String datesString = "4\n12/02/2013\n14/11/2019\n30/04/2020\n26/01/2021";
        String[] dates = Questao11.convertString(datesString);
        for (String date : dates) {
            Questao8 sut = Questao11.isValid(date);
            assertEquals("Deve retornar true para todas as datas", true, sut.valid());
            assertEquals("Deve retornar uma mensagem de erro vazia para todas as datas", "", sut.error());
        }
    }
}
