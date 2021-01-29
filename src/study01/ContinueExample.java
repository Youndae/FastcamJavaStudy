package study01;

public class ContinueExample {

    public static void main(String[] args){

        int num;

        for(num = 1; num <= 100; num++){

            if((num % 3) != 0) continue;

            System.out.println(num);
        }
        //3의 배수만 출력되게 된다.
        //1을 예로 들면 1은 3으로 나눴을 때 나머지가 0이 아니다.
        //그래서 continue로 인해 아래 출력문은 실행되지 않고
        //num값이 증가된 후 반복문이 다시 처음부터 돌아간다.

    }
}
