package study01;

public class OperatorEx3 {
    public static void main(String[] args) {

        int score = 100;

        System.out.println(++score);
        /*score = score + 1;
        score += 1
        이것과 같다*/

        System.out.println(score++);
        System.out.println(score);
        System.out.println(--score);
        System.out.println(score--);
        System.out.println(score);

    }
}
