package main.java.questao_3;

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
}
