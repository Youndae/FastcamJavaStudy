package step6.ObjectArray;

public class BookArrayTest {

    public static void main(String[] args) {
        Book[] library = new Book[5];
        //배열이 5개 생긴거지 책이 5권 생긴게 아니다

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");


       for(int i = 0; i < library.length; i++){
            System.out.println(library[i]);
            //library에 직접 값을 넣어주기 전에는 null만 출력된다.
           //값을 넣어준 이후로는 주소값만이 출력되는것을 확인할 수 있다.
           library[i].showBookInfo();
           //넣어준 값은 이렇게 확인할 수 있다.
        }
    }
}
