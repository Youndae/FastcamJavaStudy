package step6.ObjectArray;

public class ObjectCopy {

    public static void main(String[] args) {

        Book[] library = new Book[5];

        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");


        System.arraycopy(library, 0, copyLibrary, 0, 5);

        for( Book book : copyLibrary){
            //향상된 for문.
            //타입 변수 : 배열
            //이렇게 작성하면 배열전부를 돌고 하나하나
            //엘레멘트를 하나씩 꺼내올때마다 변수에 넣겠다는 것.
            book.showBookInfo();
        }
        System.out.println("=========");
        library[0].setTitle("나무");
        library[0].setAuthor("박완서");

        for(Book book : library){
            book.showBookInfo();
        }

        System.out.println("==========");

        for(Book book : copyLibrary){
            book.showBookInfo();
            //이렇게 하면 이미 복사한 상태에서 0번 값을 바꿨기 때문에
            //그냥 출력될것이라고 생각할 수 있지만
            //바뀐 값이 출력된다.
            /*
            이걸 얕은 복사라고 한다.
            실제로 인스턴스가 새로 생겨서 복사되는것이 아닌
            주소만 복사하게 되는 것이다.
            그래서 그 주소 자체 값이 바뀐것이기 때문에
            copy도 변경되는 것이다.

            만약 이 배열은 바뀌지 않았으면 한다면
            일일히 객체를 BOok를 새로 만들어서
            하나하나 다 대입을 해줘야 한다.
            System.arraycopy를 사용하면 안된다.
             */
        }

    }


}
