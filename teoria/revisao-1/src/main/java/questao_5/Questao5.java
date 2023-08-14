package main.java.questao_5;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * Um estudante muito organizado está matriculado em N disciplinas, 
 * e dispõe de um total semanal de H horas e M minutos para estudar. 
 * Sua intenção é dividir o tempo disponível igualmente para as N 
 * disciplinas, e distribuir o tempo de descanso que sobrar nas pausas 
 * entre as disciplinas. Crie um ou mais métodos para informar ao estudante 
 * como ele deve organizar seu plano de estudos.
 */
public class Questao5 {
    private double hoursToStudy = 0;
    private int minutesToStudy = 0;
    private int interval = 0;

    public String execute(int inputHoursAvaible, int inputMinutesAvaible, int inputClasses)
            throws IllegalArgumentException {
        if (inputClasses <= 0) {
            throw new IllegalArgumentException("inputClasses should be greater than zero");
        }

        if (inputHoursAvaible < 0 || inputMinutesAvaible < 0 || inputClasses < 0) {
            throw new IllegalArgumentException("Every argument should be positive");
        }

        double totalMinutes = (double) inputHoursAvaible * 60 + inputMinutesAvaible;
        double dividedTimeInMinutes = totalMinutes / inputClasses;
        BigDecimal interval = new BigDecimal(dividedTimeInMinutes * 0.15).setScale(2, RoundingMode.HALF_UP);
        this.interval = interval.intValue();
        double timeToStudyInMinutes = totalMinutes - this.interval
                * (double) inputClasses;
        this.minutesToStudy = new BigDecimal(timeToStudyInMinutes).setScale(2, RoundingMode.HALF_UP).intValue();
        this.hoursToStudy = new BigDecimal(timeToStudyInMinutes).setScale(2, RoundingMode.HALF_UP).doubleValue() / 60;
        return this.getPrintResult();
    }

    private String getPrintResult() {
        return "Você deverá dedicar " + this.minutesToStudy + " minutos por dia para cada uma das matérias. " +
                "Com " + this.interval + " minutos de intervalo entre elas";
    }

    public double getHoursToStudy() {
        return this.hoursToStudy;
    }

    public int getMinutesToStudy() {
        return this.minutesToStudy;
    }

    public int getInterval() {
        return this.interval;
    }

    public static void enunciado() {
        System.out.println("Um estudante muito organizado está matriculado em N disciplinas,");
        System.out.println("e dispõe de um total semanal de H horas e M minutos para estudar.");
        System.out.println("Sua intenção é dividir o tempo disponível igualmente para as N disciplinas,");
        System.out.println("e distribuir o tempo de descanso que sobrar nas pausas entre as disciplinas.");
        System.out.println(
                "Crie um ou mais métodos para informar ao estudante como ele deve organizar seu plano de estudos.");
    }
}
