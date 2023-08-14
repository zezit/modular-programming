package main.java.questao_6;

/*
 * Mensalmente, a organização de moradores do bairro faz um sorteio cujos
 * bilhetes contêm números de 6 dígitos. O sorteio é baseado nos dois primeiros 
 * números da loteria federal, sendo que o número vencedor no sorteio da organização 
 * é formado pelos três primeiros dígitos do segundo prêmio e os três últimos dígitos 
 * do primeiro prêmio da loteria federal. Por exemplo, se o primeiro prêmio fosse 34.582 
 * e o segundo 54.098, o número vencedor seria 540.582. Escreva um programa que leia os 
 * prêmios da loteria federal e retorna o número vencedor da organização.
 */
public class Questao6 {
    private int lastAward;
    private int firstAward;

    public Questao6(int first, int last) {
        this.firstAward = first;
        this.lastAward = last;
    }

    public int execute() {
        int result = this.getFirstThreeDigits();
        result += this.getLastThreeDigits();

        return result;
    }

    public int getFirstThreeDigits() {
        int digits = numberOfDigits(this.lastAward);
        if (digits < 4) {
            return this.lastAward * 1000;
        }
        int newValue = this.lastAward / (int) Math.pow(10, digits - 3);
        return (int) (1000 * (long) newValue / (int) Math.pow(10, digits - digits));
    }

    public int getLastThreeDigits() {
        int digits = numberOfDigits(this.firstAward);
        if (digits < 4) {
            return this.firstAward;
        }
        return (int) ((double) this.firstAward % 1000);
    }

    public static int numberOfDigits(int number) {
        if (number == 0)
            return 1;
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void enunciado() {
        System.out.println("Mensalmente, a organização de moradores do bairro faz um sorteio cujos");
        System.out.println("bilhetes contêm números de 6 dígitos. O sorteio é baseado nos dois primeiros");
        System.out.println("números da loteria federal, sendo que o número vencedor no sorteio da");
        System.out.println("organização é formado pelos três primeiros dígitos do segundo prêmio");
        System.out.println("e os três últimos dígitos do primeiro prêmio da loteria federal.");
        System.out.println("Por exemplo, se o primeiro prêmio fosse 34.582");
        System.out.println("e o segundo 54.098, o número vencedor seria 540.582.");
        System.out.println("Escreva um programa que leia os prêmios da loteria federal");
        System.out.println("e retorne o número vencedor da organização.");
    }
}
