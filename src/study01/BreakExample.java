package study01;

public class BreakExample {

    public static void main(String[] args){

        int sum = 0;
        int num;
        for(num = 1; ; num++){
            sum += num;

            if(sum >= 100) break;
        }

        System.out.println(sum);
        System.out.println(num);
        //num의 값이 14가 나오는데
        //sum이 100보다 커진 상태에서 break를 만나
        //반복문을 탈출했고
        //for 문에 있는 num++가 수행되지 않았기 때문에
        //14로 출력되는 것이다.
    }
}
