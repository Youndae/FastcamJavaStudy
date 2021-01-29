package step7.polymorphism;

import java.util.ArrayList;

class Animal{

    public void move(){
        System.out.println("동물이 움직입니다.");
    }

}

class Human extends Animal{
    public void move(){
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBooks(){
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{

    public void move(){
        System.out.println("호랑이가 네발로 뜁니다.");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying(){
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
        //이런 부분들은 animal.으로 쓸수가 없다. 각 클래스마다 다른 메소드들이기 때문에.
    }
}



public class AnimalTest {

    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        hAnimal.move();


        /*Human human = (Human)hAnimal;
        human.readBooks();*/



        /*Eagle human1 = (Eagle)hAnimal;
        human1.flying();
            이 인스턴스는 human인데 Eagle로 강제 캐스팅을 하려고 했으나
            Eagle이 아니기 때문에 에러가 난다.
            물론 코드상에서는 따로 티가나지 않아 모르지만
            실행하면 classCastException이 발생한다.

            지금처럼 작성하면 찾기 편하지만 매개변수로 넘어왔다거나 하면 문제가 생길 수 있다.
            그럴때는 아래와같이 한다.


        if(hAnimal instanceof Eagle){
            Eagle human1 = (Eagle)hAnimal;
            human1.flying();
        }

            hAnimal의 인스턴스가 Eagle이면
            이라는 조건문이다.
            false기 때문에 안에 있는 코드가 처리안되고 넘어가기 때문에
            ClassCastException이 발생하지 않는다.
         */


        /*AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);*/

        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
        System.out.println("====================");
        for(Animal animal : animalList){
            animal.move();
            //이렇게 작성하면 위에 test부분은 주석처리를 해도 같은 결과값이 출력된다.

            //같은 방식인데 이렇게 처리된것 역시 다형성이다.
            //코드는 하나지만 구현된 내용이 모두 다르게 나온다.
            //move가 호출이 되면 각 인스턴스의 move가 호출되는것이고
            //가상메소드(Virtual Method)방식이고 가상메소드에 매핑되는 함수가 호출되면서
            //다양한 구현이 이루어지는것.
        }
    }
    //하나의 코드가 여러 자료형이 구현이 되서
    //다른 실행이 이루어 지는것이 다형성이다.
    //여러 클래스가 Animal이라는 클래스 하나로
    //다 같이 돌아갈 수 있는것.

    /*
        각각의 클래스이지만 결국 다 Animal이라는 것이다.
        각각 돌아갈 여러 메소드가 있다고 했을 때
        그걸 각각 따로 구현할 수도 있지만
        하나로 구현할 수도 있다는 것.
     */
    public void moveAnimal(Animal animal){
        animal.move();
        /*animal.readBooks();*/
        //이건 Human의 타입이 Animal이기 때문에 불가능하다.
        //타입이 Human이면 가능하고.

    }

    public void testDownCasting(ArrayList<Animal> list){
        for(int i = 0; i < list.size(); i++){
            Animal ani = list.get(i);

            if(ani instanceof Human){
                Human human = (Human)ani;
                human.readBooks();
            }else if(ani instanceof Tiger){
                Tiger tiger = (Tiger)ani;
                tiger.hunting();
            }else if(ani instanceof Eagle){
                Eagle eagle = (Eagle)ani;
                eagle.flying();
            }else{
                System.out.println("error");
            }
        }
    }

}
/*
    정리하자면
    Animal에서 각 클래스가 상속을 받았고 상속을 했을 때 어떻게 생성이 되는지에
    관계에 의해서 관계가 이루어진다.
    Human이 Animal을 내포하고 있는 관계
    휴면에서 재정의(Overriding)을 할 수 있고
    오버라이딩 되었을 때 메소드의 호출은 인스턴스의 메소드가 호출된다.

 */
