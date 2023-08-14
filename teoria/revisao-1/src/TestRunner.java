import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test.java.questao_1.Questao1Test;
import test.java.questao_2.Questao2Test;
import test.java.questao_3.Questao3Test;
import test.java.questao_4.Questao4Test;
import test.java.questao_5.Questao5Test;
import test.java.questao_6.Questao6Test;
import test.java.questao_7.Questao7Test;
import test.java.questao_8.Questao8Test;
import test.java.questao_9.Questao9Test;
import test.java.questao_10.Questao10Test;
import test.java.questao_11.Questao11Test;

public class TestRunner {
    public static void main() {
        Result result1 = JUnitCore.runClasses(Questao1Test.class);
        Result result2 = JUnitCore.runClasses(Questao2Test.class);
        Result result3 = JUnitCore.runClasses(Questao3Test.class);
        Result result4 = JUnitCore.runClasses(Questao4Test.class);
        Result result5 = JUnitCore.runClasses(Questao5Test.class);
        Result result6 = JUnitCore.runClasses(Questao6Test.class);
        Result result7 = JUnitCore.runClasses(Questao7Test.class);
        Result result8 = JUnitCore.runClasses(Questao8Test.class);
        Result result9 = JUnitCore.runClasses(Questao9Test.class);
        Result result10 = JUnitCore.runClasses(Questao10Test.class);
        Result result11 = JUnitCore.runClasses(Questao11Test.class);

        imprimirFalhas(result1);
        imprimirFalhas(result2);
        imprimirFalhas(result3);
        imprimirFalhas(result4);
        imprimirFalhas(result5);
        imprimirFalhas(result6);
        imprimirFalhas(result7);
        imprimirFalhas(result8);
        imprimirFalhas(result9);
        imprimirFalhas(result10);
        imprimirFalhas(result11);

        boolean todosSucesso = result1.wasSuccessful() && result2.wasSuccessful() &&
                result3.wasSuccessful() && result4.wasSuccessful() &&
                result5.wasSuccessful() && result6.wasSuccessful() &&
                result7.wasSuccessful() && result8.wasSuccessful() &&
                result9.wasSuccessful() && result10.wasSuccessful();

        String resultString = todosSucesso ? "sim" : "não";

        System.out.println("Todos os testes foram bem-sucedidos? " + resultString);
    }

    private static void imprimirFalhas(Result result) {
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
