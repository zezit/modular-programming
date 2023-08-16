package main.java.questao_8;

import java.util.HashMap;
import java.util.Map;

/*
 * Escreva um método que verifique se uma data é válida, a partir de um dado
 * recebido do usuário no formato DD/MM/AAAA. Se a data for inválida, informe ao
 * usuário onde está o erro.
 */
public class Questao8 {
    private String errorMessage;
    private Boolean validation;
    private int day;
    private int month;
    private int year;

    protected Questao8(Boolean valid, String error, String date) {
        this.errorMessage = error;
        this.validation = valid;
    }

    public static Questao8 isValid(String date) throws UnsupportedOperationException{
        if (!date.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")) {
            return new Questao8(false, "Formato deve ser DD/MM/AAAA", date);
        }

        if (date == null || date.equals("")) {
            return new Questao8(false, "É necessário fornecer uma data", date);
        }

        Map<String, Number> dateMap = getDateNumbersMap(date);

        if (!validateMonth(dateMap.get("mes"))) {
            return new Questao8(false, "Mês inválido, mês deve estar entre 1 e 12\n" + date + "\n    ^\n", date);
        }

        if (!validateYear(dateMap.get("ano"))) {
            return new Questao8(false, "Ano inválido, ano deve ser maior ou igual a 0\n" + date + "\n      ^\n", date);
        }

        if (!validateDayGeneral(dateMap.get("dia"))) {
            return new Questao8(false, "Dia inválido, dia deve estar entre 1 e 31\n" + date + "\n    ^\n", date);
        }

        String validation = j(dateMap);
        if (!validation.equals("")) {
            return new Questao8(false, validation + "\n" + date + "\n ^\n", date);
        }

        Questao8 validDate = new Questao8(true, "", date);
        validDate.setValids(dateMap);
        return validDate;
    }

    private void setValids(Map<String, Number> dateSplited) {
        this.day = dateSplited.get("dia").intValue();
        this.month = dateSplited.get("mes").intValue();
        this.year = dateSplited.get("ano").intValue();
    }

    private static String j(Map<String, Number> dateMap) {
        Number month = dateMap.get("mes");
        Number day = dateMap.get("dia");
        Number year = dateMap.get("ano");

        if (month.intValue() == 4 || month.intValue() == 6 || month.intValue() == 9 || month.intValue() == 11) {
            if (day.intValue() > 30) {
                return "Dia inválido, dia deve estar entre 1 e 30";
            }
        }

        if (month.intValue() == 2) {
            if (isLeapYear(year) && day.intValue() > 29) {
                return "Dia inválido, dia deve estar entre 1 e 29";
            }

            if (!isLeapYear(year) && day.intValue() > 28) {
                return "Dia inválido, dia deve estar entre 1 e 28";
            }
        }

        return "";
    }

    private static boolean isLeapYear(Number year) {
        if ((year.intValue() % 4 == 0 && year.intValue() % 100 != 0) || year.intValue() % 400 == 0) {
            return true;
        }
        return false;
    }

    private static boolean validateDayGeneral(Number number) {
        return number.intValue() >= 1 && number.intValue() <= 31;
    }

    private static Boolean validateYear(Number number) {
        return number.intValue() >= 0;
    }

    static private Boolean validateMonth(Number num) {
        return num.intValue() >= 1 && num.intValue() <= 12;
    }

    static private Map<String, Number> getDateNumbersMap(String date) {
        String[] dateSplited = date.split("/");

        Map<String, Number> dateMap = new HashMap<>();

        dateMap.put("dia", Integer.valueOf(dateSplited[0]));
        dateMap.put("mes", Integer.valueOf(dateSplited[1]));
        dateMap.put("ano", Integer.valueOf(dateSplited[2]));

        return dateMap;
    }

    public Boolean valid() {
        return this.validation;
    }

    public String error() {
        return this.errorMessage;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public static void enunciado() {
        System.out.println("Escreva um método que verifique se uma data é válida, a partir de um dado\n"
                + "recebido do usuário no formato DD/MM/AAAA. Se a data for inválida, informe ao\n"
                + "usuário onde está o erro.");
    }
}
