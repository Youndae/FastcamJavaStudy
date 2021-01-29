package oopStudy.Test2.Ex2;

/**
 * 출근길 커피사기
 *
 * 아침 출근길에 김졸려는 4,000원을 내고 별다방에서 아메리카노를 사먹었다.
 * 이피곤은 콩다방에서 4,500원을 내고 라떼를 사먹었다.
 * 객체간의 협력 강의를 참고하여 객체지향 방법으로 구현해볼것.
 *
 * 출력결과
 * Kim 님이 4000원으로 별다방 아메리카노를 구입했습니다.
 * Lee 님이 4500원으로 콩다방 라떼를 구입했습니다.
 */
public class CoffeTest {

    public static void main(String[] args) {

        Person Kim = new Person("Kim", 10000);
        Person Lee = new Person("Lee", 10000);
        StarCoffee starCoffee = new StarCoffee();
        BeanCoffee beanCoffee = new BeanCoffee();

        Kim.buyStarCoffee(starCoffee, Menu.StarAmericano);
        Lee.buyBeanCoffee(beanCoffee, Menu.BeanLatte);
    }
}
