package study01;

import java.util.Scanner;

public class SwitchCaseEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rank = scanner.nextInt();
        char medalColor;


        switch(rank){
            case 1: medalColor = 'G';
                break;
            case 2: medalColor = 'S';
                break;
            case 3: medalColor = 'B';
                break;
            default: medalColor = 'A';
        }

        System.out.println(rank + "등은 " + medalColor + "메달입니다.");
    }



}
