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
            int userOption = Utils.readInt("Escolha uma opcao: ");
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
    }

    private static void executeQuestion(int userOption) {
        switch (userOption) {
            case 1:
                Questao1.enunciado();
                int []entry = Utils.readIntArray();;
                Questao1.execute(entry);
                Questao1.showResult();
                break;
        
            default:
                break;
        }
    }
}
