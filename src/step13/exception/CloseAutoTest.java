package step13.exception;

public class CloseAutoTest {

    public static void main(String[] args) {

        try(AutoCloseObj obj = new AutoCloseObj()){
            /*
                그냥 try했을때는 아무것도 안하고 new했으니 그냥 수행됬을 것이고
                Exception이 들어온게 없을 것이기 때문에
                close가 호출되면 생성이 된다음에 오픈되서 close가 잘 호출된것이다.

             */

            //Exception 발생
            throw new Exception();
        }catch(Exception e){
            System.out.println(e);
            //Exception이 발생된 이후에도
            //close가 호출되는것을 확인할 수 있다.

        }
    }
}
