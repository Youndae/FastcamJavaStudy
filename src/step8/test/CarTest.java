package step8.test;

import java.util.ArrayList;

/**
 * Car 추상클래스를 상속받는 Sonata, Avante, Grandeur, Genesis 클래스가 있다.
 * 각 차는 주행하기 위해 다음 메소드의 순서로 움직인다.
 *
 * public void run(){
 *         start();
 *         drive();
 *         stop();
 *         turnoff();
 *     }
 *
 * run() 메소드를 템플릿 메소드로 구현하고 CarTest 클래스를 참고하여 프로그램을 완성하라.
 *
 * 출력결과
 *
 * Sonata 시동을 켭니다.
 * Sonata 달립니다.
 * Sonata 멈춥니다.
 * Sonata 시동을 끕니다.
 * ====================
 * Grandeur 시동을 켭니다.
 * Grandeur 달립니다.
 * Grandeur 멈춥니다.
 * Grandeur 시동을 끕니다.
 * ====================
 * Avante 시동을 켭니다.
 * Avante 달립니다.
 * Avante 멈춥니다.
 * Avante 시동을 끕니다.
 * ====================
 * Genesis 시동을 켭니다.
 * Genesis 달립니다.
 * Genesis 멈춥니다.
 * Genesis 시동을 끕니다.
 * ====================
 *
 * 이 클래스 제외하고는 강의 답안과 내가 작성 두가지있음.
 * 일단 그냥 가져다 출력하는 정도의 답안이라서 바꿔서 해봤는데
 * 결국 run()메소드에서 carName을 너무 반복해야 되기 때문에
 * 이것도 좀 비효율적인것 같기도하고..
 * 그래도 만약 carName만 바꿔야 되는 상황이다
 * 라고 했을때는 출력문 다 바꾸는것보다는 carName하나만 바꿔주면 되니까
 * 그게 더 나은것 같기도하고...
 */
public class CarTest {

    public static void main(String[] args) {
        ArrayList<Car> carList =  new ArrayList<Car>();

        carList.add(new Sonata());
        carList.add(new Grandeur());
        carList.add(new Avante());
        carList.add(new Genesis());

        for(Car car : carList){
            car.run();
            System.out.println("====================");
        }
    }
}
