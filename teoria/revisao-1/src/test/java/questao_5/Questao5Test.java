package test.java.questao_5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import main.java.questao_5.Questao5;

public class Questao5Test {
    @Test
    public void it_should_the_correct_expected_minutes_to_study() {
        int inputHoursAvaible = 7;
        int inputMinutesAvaible = 32;
        int inputClasses = 5;

        int expectedStudyMinute = 387;

        Questao5 sut = new Questao5();
        sut.execute(inputHoursAvaible, inputMinutesAvaible, inputClasses);
        int resultMinutes = sut.getMinutesToStudy();

        assertEquals("Deve retornar a quantidade correta total de minutos para estudar", expectedStudyMinute,
                resultMinutes);
    }

    @Test
    public void it_should_get_the_correct_expected_hours_to_study() {
        int inputHoursAvaible = 7;
        int inputMinutesAvaible = 32;
        int inputClasses = 5;

        double expectedStudyHours = 6.37;

        Questao5 sut = new Questao5();
        sut.execute(inputHoursAvaible, inputMinutesAvaible, inputClasses);
        double resultHours = sut.getHoursToStudy();

        assertEquals("Deve retornar a quantidade correta total de horas para estudar", expectedStudyHours,
                resultHours, 2);
    }

    @Test
    public void it_should_the_correct_expected_intervals_between_studies() {
        int inputHoursAvaible = 7;
        int inputMinutesAvaible = 32;
        int inputClasses = 5;

        int expectedInterval = 13;

        Questao5 sut = new Questao5();
        sut.execute(inputHoursAvaible, inputMinutesAvaible, inputClasses);
        int resultInterval = sut.getInterval();

        assertEquals("Deve retornar a quantidade correta total de minutos de intervalos entres os estudos",
                expectedInterval,
                resultInterval);
    }

    @Test
    public void it_should_return_the_correct_string_based_on_inputs() {
        int inputHoursAvaible = 7;
        int inputMinutesAvaible = 32;
        int inputClasses = 5;

        String expectedString = "Você deverá dedicar 387 minutos por dia para cada uma das matérias. Com 13 minutos de intervalo entre elas";

        Questao5 sut = new Questao5();
        String resultString = sut.execute(inputHoursAvaible, inputMinutesAvaible,
                inputClasses);

        assertEquals("Dever retornar exatamente a frase esperada de acordo com as entradas do usuário", expectedString,
                resultString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_throws_if_classes_is_zero_or_less() {
        int inputHours = 1231;
        int inputMinutes = 13123;
        int inputClasses = -10;

        new Questao5().execute(inputHours, inputMinutes, inputClasses);
    }

    @Test(expected = IllegalArgumentException.class)
    public void it_should_throws_if_any_arguments_is_less_than_zero() {
        int inputHours = -1;
        int inputMinutes = -1;
        int inputClasses = 10;

        new Questao5().execute(inputHours, inputMinutes, inputClasses);
    }

    // TODO - create test to verify it the input does not trespass 24 hours
}
