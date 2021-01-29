package step15.multiThread.notifyWait;

import java.util.ArrayList;

class FastLibrary{

    public ArrayList<String> books = new ArrayList<String>();

    public FastLibrary(){
        books.add("태백산맥 1");
        books.add("태백산맥 2");
        books.add("태백산맥 3");
        books.add("태백산맥 4");
        books.add("태백산맥 5");
        books.add("태백산맥 6");
    }

    public synchronized String rentBook(){

        Thread t = Thread.currentThread();

        String title = books.remove(0);
        System.out.println(t.getName() + " : " + title + " rent");
        return title;
    }

    public synchronized void returnBook(String title){

        Thread t = Thread.currentThread();

        books.add(title);
        System.out.println(t.getName() + " : " + title + " return");
    }
}

class Student extends Thread{
    public void run(){

        try {
            String title = LibraryMain.library.rentBook();
            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class LibraryMain {

    public static FastLibrary library = new FastLibrary();


    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();


        std1.start();
        std2.start();
        std3.start();
    }
    /*
        여기서 shared resource 가 되는 것은 library다.
        동시에 빌릴일은 별로 없겠지만
        synchronized는 rent와 return에 걸어주는게 좋다.
     */
}
