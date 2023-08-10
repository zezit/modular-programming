package main.java.questao_4;

/*
 * Elabore um programa que leia uma frase e mostre-a invertida na tela.
 * Após mostrar a primeira frase, o programa deve ler e imprimir outra,
 * assim fazendo até que o usuário digite a palavra “fim”.
 */
public class Questao4 {
    public static Boolean execute(String input) {
        if (input.equals("fim")) {
            return false;
        }

        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        System.out.println(result);
        return true;
    }

    public static void enunciado() {
        System.out.println("Elabore um programa que leia uma frase e mostre-a invertida na tela.");
        System.out.println("Após mostrar a primeira frase, o programa deve ler e imprimir outra,");
        System.out.println("assim fazendo até que o usuário digite a palavra “fim”.");
    }
}
