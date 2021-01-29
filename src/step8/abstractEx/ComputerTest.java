package step8.abstractEx;

public class ComputerTest {

    public static void main(String[] args) {
        /*Computer computer = new Computer(); 추상클래스는 이렇게 인스턴스화 할 수 없다.*/

        Computer computer = new Desktop();
        //추상클래스를 상속받은 하위클래스를 상위클래스 타입으로 핸들링해서 사용한다 보통은.
        computer.display();
        computer.turnOff();
        /*
            Desktop클래스에서 따로 정의하지 않는다면 Computer클래스에 정의한대로 출력될것이고
            Desktop클래스에서 재정의를 했다면 재정의한것이 출력된다.
         */

        Computer myNote = new MyNotebook();
        //Notebook myNote = new MyNotebook(); 이렇게 선언해도 된다.
        //Notebook의 하위클래스이지만 Notebook이 Computer의 하위클래스이기도 하니까.
    }
}
