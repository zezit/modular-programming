package main.java.questao_11;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import main.java.questao_8.Questao8;
import main.java.utils.FileReader;

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
public class Questao11 extends Questao8 {
    private FileReader file = null;
    private ArrayList<String> stringArraysIn = new ArrayList<String>();
    private ArrayList<String> stringArraysOut = new ArrayList<String>();

    public Questao11() {
        super(false, "", "");
    }

    public Questao11(FileReader file) {
        super(false, "", "");
        this.file = file;
    }

    protected Questao11(Boolean valid, String error, String date) {
        super(valid, error, date);
    }

    public static String[] convertString(String dates) {
        String[] baseArray = dates.split("\n");
        String[] datesArray = new String[baseArray.length - 1];
        for (int i = 1; i < baseArray.length; i++) {
            datesArray[i - 1] = baseArray[i];
        }

        return datesArray;
    }

    public void run() throws FileNotFoundException {
        if (this.file != null) {
            int numberOfDates = Integer.parseInt(this.file.ler());
            while (numberOfDates > 0) {
                try {
                    String date = this.file.ler();
                    Questao8 questao8 = Questao8.isValid(date);
                    if (questao8.valid()) {
                        this.stringArraysIn.add(date);
                        this.stringArraysOut.add("Data válida");
                    } else {
                        this.stringArraysIn.add(date);
                        this.stringArraysOut.add(questao8.error());
                    }
                } catch (Exception e) {
                    System.out
                            .println("Invalid input " +
                                    e.getMessage() +
                                    " on line " +
                                    stringArraysIn.size() + 1 +
                                    ".");
                }
            }
            return;
        }

        throw new FileNotFoundException();
    }

    public void showReadingResult() {
        for (String intArray : stringArraysOut) {
            System.out.println("Input: " + this.stringArraysIn
                    .get(stringArraysOut.indexOf(intArray) + 1));
            System.out.println("Output: " + this.stringArraysOut
                    .get(stringArraysOut.indexOf(intArray)));
        }
    }

    public static void enunciado() {
        System.out.println(
                "Refaca o exercicio 08, adicionando a capacidade de ler varias datas de um arquivo texto. O arquivo contera, em sua primeira linha, o numero de datas das linhas seguintes. Por exemplo,\n"
                        +
                        "\n" +
                        "4\n" +
                        "12/02/2013\n" +
                        "14/11/2019\n" +
                        "31/04/2020\n" +
                        "26/01/2021\n" +
                        "\n" +
                        "Escreva um metodo que verifique se uma data e valida, a partir de um dado recebido do usuario no formato DD/MM/AAAA. Se a data for invalida, informe ao usuario onde esta o erro.");
    }
}
