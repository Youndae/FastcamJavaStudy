package step15.thread;

import java.io.IOException;

public class TerminateThread extends Thread{

    private boolean flag = false;
    int i;

    public TerminateThread(String name){
        super(name);
        //스레드 생성자 중에 스레드 이름을 받을 수 있는 생성자가 있다.
    }

    public void run(){
        while(!flag){

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(getName() + "end");
    }

    public void setFlag(boolean flag){
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {
        TerminateThread threadA = new TerminateThread("A");
        TerminateThread threadB = new TerminateThread("B");

        threadA.start();
        threadB.start();

        int in;
        while(true){
            in = System.in.read();
            if(in == 'A'){
                threadA.setFlag(true);
            }else if(in == 'B'){
                threadB.setFlag(true);
            }else if(in == 'M'){
                threadA.setFlag(true);
                threadB.setFlag(true);
                break;
            }/*else{
                System.out.println("try again");
                값을 입력하고 엔터를 치면
                \n 이 같이 들어가기 때문에 try again이 계속 출력된다.
                그래서 그냥 주석처리.

                A를 입력하면 Aend, B를 입력하면 Bend
                M을 입력하면 main end가 출력되고
                종료된다.
                처음부터 M을 입력하면 main end Aend Bend 가 출력되고
                종료된다.
            }*/
        }
        System.out.println("main end");
    }
}
