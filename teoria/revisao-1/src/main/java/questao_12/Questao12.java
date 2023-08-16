package main.java.questao_12;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import main.java.questao_4.Questao4;
import main.java.utils.FileReader;

/*
 * Refaça o exercício 04, fazendo com que o programa leia de um arquivo
 * todas as frases a serem impressas de forma invertida. A última linha deste
 * arquivo terá a palavra “fim”.
*/

/*
 * Elabore um programa que leia uma frase e mostre-a invertida na tela.
 * Após mostrar a primeira frase, o programa deve ler e imprimir outra,
 * assim fazendo até que o usuário digite a palavra “fim”.
 */
public class Questao12 extends Questao4 {
    private FileReader file = null;
    private ArrayList<String> stringArraysIn = new ArrayList<String>();
    private ArrayList<String> stringArraysOut = new ArrayList<String>();

    public Questao12(FileReader file) {
        this.file = file;
    }

    public void run() throws FileNotFoundException {
        if (this.file != null) {
            String fileLine = this.file.ler();
            while (this.execute(fileLine)) {
                String out = this.getResult();
                stringArraysIn.add(fileLine);
                stringArraysOut.add(out);
                fileLine = this.file.ler();
            }
            return;
        }

        throw new FileNotFoundException();
    }

    public void showReadingResult() {
        System.out.println("__________________________");
        System.out.println("|  Entradas   |  Saídas   |");
        System.out.println("__________________________");
        for (int i = 0; i < stringArraysIn.size(); i++) {
            System.out.printf("| %-10s | %-10s |\n", stringArraysIn.get(i), stringArraysOut.get(i));
        }
        System.out.println("__________________________");
    }
}
