package main.java.questao_9;

import main.java.questao_8.Questao8;

public class Questao9 extends Questao8 {
    /*
     * Sabendo que 1º de janeiro de 2024 será uma segunda feira, escreva um método
     * que receba uma data e diga em qual dia da semana esta data acontecerá em
     * 2024. Escreva um programa principal para testar seu método.
     */

    private String week = "";
    private String errorYear = "";

    private Questao9(Boolean valid, String error, String date) {
        super(valid, error, date);
    }

    public static Questao9 validate(String date) {
        Questao8 creationBase = Questao8.isValid(date);
        Questao9 questao9 = new Questao9(creationBase.valid(), creationBase.error(), date);

        if (questao9.valid() && validateUniqueYear(creationBase.getYear())) {
            questao9.setWeekDay(getWeekDayString(creationBase.getDay()));
            return questao9;
        }

        questao9.setWeekDay("");
        questao9.errorYear = "Ano inválido";

        return questao9;
    }

    public static String getWeekDayString(int day) {
        int weekDay = day % 7;

        switch (weekDay) {
            case 0:
                return "domingo";
            case 1:
                return "segunda feira";
            case 2:
                return "terça feira";
            case 3:
                return "quarta feira";
            case 4:
                return "quinta feira";
            case 5:
                return "sexta feira";
            case 6:
                return "sábado";
            default:
                return "dia inválido";
        }
    }

    private static Boolean validateUniqueYear(int year) {
        return year == 2024;
    }

    public String weekDay() {
        return this.week;
    }

    public String errorDayString() {
        return this.errorYear;
    }

    public void setWeekDay(String weekDayString) {
        this.week = weekDayString;
    }
}
