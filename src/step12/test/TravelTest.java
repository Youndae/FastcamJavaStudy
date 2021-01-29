package step12.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 패키지 여행을 떠나는 고객들이 있다.
 * 여행비용은 15세 이상은 100만원, 그 미만은 50만원이다.
 * 다음과 같이 고객 세명이 여행을 간다고 했을 때 비용과 고객명단에 대한 출력을
 * 스트림을 활용하여 만들어 볼것
 * 고객리스트
 * 번호   이름      나이      비용
 * 1    이순신      40       100
 * 2    김유신      20       100
 * 3    홍길동      13       50
 *
 * 1. 고객명단 출력
 * 2. 여행의 총 비용 계산
 * 3. 고객중 20세 이상인 사람을 이름으로(오름차순) 정렬하여 출력
 *
 */

public class TravelTest {

    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();

        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        //List출력
        System.out.println(customerList);

        //각 고객의 이름 순서대로 출력
        customerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));

        //총 비용
        int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println(total);

        //고객명단 정렬
        customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s-> System.out.println(s));
        //20세 이상인 사람만 가져오고 그사람들의 이름을 가져오고 그 이름들을 sorted해서 정렬하고 그 정렬한 데이터를 출력

        //sorted까지 중간연산인것.

    }
}
