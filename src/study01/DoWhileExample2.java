package study01;

import java.util.Scanner;

public class DoWhileExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int sum = 0;

        do {
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println(sum);

        /*int input;
        int sum = 0;

        input = scanner.nextInt();

        while(input != 0){
            sum += input;
            input = scanner.nextInt();
        }

        System.out.println(sum);*/

    }
}
