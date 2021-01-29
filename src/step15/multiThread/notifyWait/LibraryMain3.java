package step15.multiThread.notifyWait;

import java.util.ArrayList;

/**
 * 책은 3권이지만 학생이 6명이라면
 * notifyAll()사용
 *
 */
class FastLibrary3{

    public ArrayList<String> books = new ArrayList<String>();

    public FastLibrary3(){
        books.add("태백산맥 1");
        books.add("태백산맥 2");
        books.add("태백산맥 3");

    }

    public synchronized String rentBook() throws InterruptedException {
        //여기서 리소스가 가능하지 않으면  못빌리도록 한다.
        Thread t = Thread.currentThread();

        /*if(books.size() == 0) return null;*/

        while (books.size() == 0){
            System.out.println(t.getName() + " waiting start");
            wait();
            //이 wait메서드에서는 currentThread를 기다리게 한다.
            System.out.println(t.getName() + " waiting end");
        }


        String title = books.remove(0);
        System.out.println(t.getName() + " : " + title + " rent");
        return title;
    }

    public synchronized void returnBook(String title){

        Thread t = Thread.currentThread();

        books.add(title);
        notifyAll();
        //책이 반납되었으므로 notify를 해준다.
        System.out.println(t.getName() + " : " + title + " return");
    }
}

class Student3 extends Thread{
    public void run(){

        try {
            String title = LibraryMain3.library.rentBook();

            if(title == null) return;

            sleep(5000);
            LibraryMain3.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain3 {

    public static FastLibrary3 library = new FastLibrary3();


    public static void main(String[] args) {
        Student3 std1 = new Student3();
        Student3 std2 = new Student3();
        Student3 std3 = new Student3();
        Student3 std4 = new Student3();
        Student3 std5 = new Student3();
        Student3 std6 = new Student3();


        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
    }
    /*
        하나씩 깨어나면 fair하지 않을 수 있다.
        잘되면 다행이지만.
        notifyAll을 하게 되면
        모든 스레드가 깨어난다.
        근데 하나만 반환했는데 모든 스레드가 깨어나면 문제가 발생할 수 있다.

        그래서 notifyAll을 사용하고
        wait을 걸어주는 조건문을 while로 바꿔준다.
        그래서 못빌린 상태면 다시 wait으로 들어가도록 한다.

        결과값
        Thread-0 : 태백산맥 1 rent
        Thread-3 : 태백산맥 2 rent
        Thread-5 : 태백산맥 3 rent
        Thread-4 waiting start
        Thread-2 waiting start
        Thread-1 waiting start
        Thread-3 : 태백산맥 2 return
        Thread-5 : 태백산맥 3 return
        Thread-1 waiting end
        Thread-1 : 태백산맥 2 rent
        Thread-2 waiting end
        Thread-2 : 태백산맥 3 rent
        Thread-4 waiting end
        Thread-4 waiting start
        Thread-0 : 태백산맥 1 return
        Thread-4 waiting end
        Thread-4 : 태백산맥 1 rent
        Thread-1 : 태백산맥 2 return
        Thread-4 : 태백산맥 1 return
        Thread-2 : 태백산맥 3 return

        결과값을 보면 일단 0, 3, 5가 rent한다.
        그래서 4, 2, 1은 wait에 빠지게 되고
        3, 5가 반납을 했다.
        그럼 반납을 했기 때문에 notifyAll로 인해 대기하고 있던 1, 2, 4가 모두 깨어난다.
        제일먼저 깨어난 1은 깨어나자마자 rent를 하고 그 다음 깨어난 2도 rent를 한다.
        하지만 아직 0이 반납을 하지 않았기 때문에 책이 없는 상태고
        깨어난 4는 다시 wait으로 들어간다.
        그리고나서 0이 반납하면 다시 4가 깨어나 rent하게 되는것.

        rent에서 조건문을 while로 바꿔줌으로써 계속 확인해가며 없는 경우 다시 wait으로
        보내는 것이다.
        
     */
}
