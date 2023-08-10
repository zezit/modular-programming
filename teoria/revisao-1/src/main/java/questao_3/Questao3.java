package main.java.questao_3;

/*
 *  Escreva um ou mais métodos para imprimir no console retângulos usando caracteres, 
 * como, por exemplo:
XXXXX
X   X
X   X
X   X
XXXXX
 */
public class Questao3 {
    public static String execute(int x, int y) {
        if(x < 0 || y < 0) {
            throw new IllegalArgumentException("x e y devem ser positivos");
        }

        String result = "";
        int lines = y;
        int columns = x;

        for (int i = 0; i < lines; i++) {
            if (i == 0 || i == lines - 1) {
                for (int j = 0; j < columns; j++) {
                    result += "X";
                }
                result += "\n";
                continue;
            }

            for (int j = 0; j < columns; j++) {
                if (j == 0 || j == columns - 1) {
                    result += "X";
                    if (j == columns - 1) {
                        result += "\n";
                    }
                    continue;
                }
                result += " ";
            }
        }

        return result;
    }

    public static void enunciado(){
        System.out.println("Escreva um ou mais métodos para imprimir no console retângulos usando caracteres, ");
        System.out.println("como, por exemplo:");
        System.out.println("XXXXX");
        System.out.println("X   X");
        System.out.println("X   X");
        System.out.println("X   X");
        System.out.println("XXXXX");
    }
}
