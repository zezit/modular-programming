import main.java.utils.Utils;

import main.java.questao_1.Questao1;
import main.java.questao_2.Questao2;
import main.java.questao_3.Questao3;
import main.java.questao_4.Questao4;

public class App {
    private static int CREATED_CLASSES = 4;

    public static void main(String[] args) throws Exception {
        while (true) {
            showMenuHeader();
            int userOption = Utils.readInt();
            userOption = checkUserOption(userOption);
            if (userOption > 0) {
                executeQuestion(userOption);
            }
        }
    }

    private static int checkUserOption(int userOption) {
        if (userOption == CREATED_CLASSES + 1) {
            System.exit(0);
        } else if (userOption > CREATED_CLASSES + 1 || userOption < 1) {
            System.out.println("Opcao invalida!");
            return -1;
        }
        return userOption;
    }

    private static void showMenuHeader() {
        System.out.println("Bem vindo ao programa de exercicios de revisão!");
        System.out.println("Escolha uma das opcoes abaixo:");
        for (int i = 0; i < CREATED_CLASSES; i++) {
            System.out.println((i + 1) + " - Questao " + (i + 1));
        }
        System.out.println(CREATED_CLASSES + 1 + " - Sair");
        System.out.print("Escolha uma opcao: ");
    }

    private static void executeQuestion(int userOption) {
        switch (userOption) {
            case 1:
                Questao1.enunciado();
                int[] entry1 = Utils.readIntArray();
                int[] result1 = Questao1.execute(entry1);
                System.out.print("[");
                for (int i = 0; i < result1.length; i++) {
                    if (i != result1.length - 1) {
                        System.out.print(result1[i] + ", ");
                        continue;
                    }
                    System.out.println(result1[i] + "]");
                }
                break;
            case 2:
                Questao2.enunciado();
                int[] entry2 = Utils.readIntArray();
                int[] result2 = Questao2.execute(entry2);
                System.out.print("[");
                for (int i = 0; i < result2.length; i++) {
                    if (i != result2.length - 1) {
                        System.out.print(result2[i] + ", ");
                        continue;
                    }
                    System.out.println(result2[i] + "]");
                }
                break;
            case 3:
                Questao3.enunciado();
                System.out.print("Digite o tamanho horizontal: ");
                int x = Utils.readInt();
                System.out.print("Digite o tamanho vertical: ");
                int y = Utils.readInt();

                System.out.println(Questao3.execute(x, y));
                break;

            case 4:
                Questao4.enunciado();
                String input = "";
                Boolean hasLine = false;
                while (true) {
                    System.out.print("Digite uma frase: ");
                    input = Utils.readString();
                    hasLine = Questao4.execute(input);
                    if(!hasLine){
                        break;
                    }
                }

            default:
                break;
        }
    }
}
