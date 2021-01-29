package study01;

public class ForExample {

    public static void main(String[] args) {

        int i;
        int sum = 0;

        for(i = 1; i < 11; i++){
            sum += i;
        }
        System.out.println(sum);

        int count = 1;
        int total = 0;

        for (int j = 0; j < 10; j++){
            total += count;
            count++;
        }
        System.out.println(total);
    }
}
