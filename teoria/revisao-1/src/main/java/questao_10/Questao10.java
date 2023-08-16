package main.java.questao_10;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import main.java.questao_2.Questao2;
import main.java.utils.FileReader;

/*
* Refaça o exercício 02, sendo que os dados serão lidos de um arquivo texto. O
* arquivo texto pode ter várias linhas e cada linha representa um vetor a ser
* utilizado pelo método. O separador usado é ponto e vírgula. Por exemplo:
* 
* 4;8;15;4;15;16;23;42
* 7;11;13;17;29;23;29;31
* 6;5;4;3;2;1
*/

/*
 * Escreva códigos Java que leiam um vetor de inteiros e criem outro vetor, 
 * contendo a soma de cada par de vizinhos do vetor original. Por exemplo, 
 * se o vetor original era 4-8-15-16-23-42, o retorno deve ser um vetor 12-31-65 
 * (ou seja, 4+8, 15+16 e 23+42). Caso o vetor tenha tamanho ímpar, o último 
 * número deve ser somado consigo mesmo. Para ler o vetor, pode aproveitar o 
 * método do exercício 02. Escreva um programa que execute e teste seu código..
*/
public class Questao10 extends Questao2 {
    private FileReader file = null;
    ArrayList<String> stringArraysIn = new ArrayList<String>();
    ArrayList<int[]> intArraysOut = new ArrayList<int[]>();

    public Questao10() {
    }

    public Questao10(FileReader file) {
        this.file = file;
    }

    public static int[] convertString(String exampleUserInput) {
        if (!exampleUserInput.matches("([0-9]+;)*[0-9]+")) {
            throw new IllegalArgumentException("Invalid input");
        }
        String[] stringArray = exampleUserInput.split(";");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public void run() throws FileNotFoundException {
        if (this.file != null) {
            String fileLine = this.file.ler();
            while (fileLine != null && fileLine.length() > 0) {
                try {
                    int[] lineArray = Questao10.convertString(fileLine);
                    intArraysOut.add(Questao10.execute(lineArray));
                    stringArraysIn.add(fileLine);
                    fileLine = this.file.ler();
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid input " + e.getMessage() + " on line " + stringArraysIn.size() + ".");
                }
            }
            return;
        }

        throw new FileNotFoundException();
    }

    public void showReadingResult() {
        for (int[] intArray : intArraysOut) {
            System.out.println("Array: " + this.stringArraysIn.get(intArraysOut.indexOf(intArray)));
            System.out.println("Summed array: " + this.intArrayToString(intArray));
        }
    }

    private String intArrayToString(int[] intArray) {
        String stringArray = "";
        for (int i = 0; i < intArray.length; i++) {
            stringArray += intArray[i];
            if (i < intArray.length - 1) {
                stringArray += ";";
            }
        }
        return stringArray;
    }
}
