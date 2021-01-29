package step15.multiThread.notifyWait;

import java.util.ArrayList;

/**
 * 책은 3권이지만 학생이 6명이라면
 *  notify()사용
 */
class FastLibrary2{

    public ArrayList<String> books = new ArrayList<String>();

    public FastLibrary2(){
        books.add("태백산맥 1");
        books.add("태백산맥 2");
        books.add("태백산맥 3");

    }

    public synchronized String rentBook() throws InterruptedException {
        //여기서 리소스가 가능하지 않으면  못빌리도록 한다.
        Thread t = Thread.currentThread();

        /*if(books.size() == 0) return null;*/

        if(books.size() == 0){
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
        notify();
        //책이 반납되었으므로 notify를 해준다.
        System.out.println(t.getName() + " : " + title + " return");
    }
}

class Student2 extends Thread{
    public void run(){

        try {
            String title = LibraryMain2.library.rentBook();

            if(title == null) return;

            sleep(5000);
            LibraryMain2.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain2 {

    public static FastLibrary2 library = new FastLibrary2();


    public static void main(String[] args) {
        Student2 std1 = new Student2();
        Student2 std2 = new Student2();
        Student2 std3 = new Student2();
        Student2 std4 = new Student2();
        Student2 std5 = new Student2();
        Student2 std6 = new Student2();


        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();
    }
    /*
        책은 3권이지만 6명의 학생이 빌리려고 하니
        IndexOutOfBoundException이 발생한다.

        rent와 run에 조건문으로 books.size가 0이면 null을 리턴
        title == null 이면 return을 하도록 하면
        책이 없을때 null을 리턴하고
        그럼 run에서는 title이 null이 되니 그냥 반환을 함으로써
        뒤에는 처리가 안되게 된다.

         근데 여기서 뒤에 있는 학생들도 책을 꼭 봐야겠다고 한다면
         대기하도록 해야한다.
         책이 들어올때까지 기다리는게 wait이고 책이 들어왔다고 알려주는것이
         notify다.

         결과값은
         Thread-0 : 태백산맥 1 rent
         Thread-4 : 태백산맥 2 rent
         Thread-5 : 태백산맥 3 rent
         Thread-2 waiting start
         Thread-3 waiting start
         Thread-1 waiting start
         Thread-5 : 태백산맥 3 return
         Thread-2 waiting end
         Thread-2 : 태백산맥 3 rent
         Thread-0 : 태백산맥 1 return
         Thread-4 : 태백산맥 2 return
         Thread-1 waiting end
         Thread-1 : 태백산맥 1 rent
         Thread-3 waiting end
         Thread-3 : 태백산맥 2 rent
         Thread-1 : 태백산맥 1 return
         Thread-2 : 태백산맥 3 return
         Thread-3 : 태백산맥 2 return
     */
}
