package main.java.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int readInt(String string) {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.close();
        return option;
    }

    public static int[] readIntArray() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Digite números inteiros (digite 'E' para sair):");
        while (scanner.hasNextInt()) {
            numeros.add(scanner.nextInt());
        }
        // while (true) {
        //     String input = scanner.nextLine();
        //     if (input.equals("E")) {
        //         break;
        //     }
        //     try {
        //         numeros.add(Integer.parseInt(input));
        //     } catch (Exception e) {
        //         System.out.println("Digite um número válido");
        //     }
        // }

        int[] result = new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            result[i] = numeros.get(i);
        }

        scanner.close();

        return result;
    }
}
