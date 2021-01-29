package step10.Object;


class Book implements Cloneable{
    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    /*@Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
        toString을 직접 작성하지 않고
        만들어주면 이렇게 작성된다.
        이클립스는 super.toString으로 작성되고.
    */

    @Override
    public String toString(){
        return author + ", "+title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        //이클립스에서 이거 그냥 만들 수 있던데
        //인텔리제이는 generate에 없어서 일단 그냥 따라서 작성함.

        //clone메소드는 특별히 구현하진 않는다.
        return super.clone();
    }
}

public class ToStringTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("토지", "박경리");

        System.out.println(book);
        //toString을 정의하지 않고 출력하면
        //step10.Object.Book@4b67cf4d
        //이렇게 메모리주소값이 나온다.

        String str = new String("토지");
        System.out.println(str);
        //String 클래스안에 toString이 이미 정의되어있기 때문에 문자열이 출력되는것.
        //어떤 객체의 정보를 문자열 형태로 출력해야 할때 toString을 사용한다.
        //toString의 원형은 메모리주소다.


        Book book2 = (Book)book.clone();
        //clone메소드의 원형이 Object로 반환된다. 그래서 (Book)이라고 명시적으로 캐스팅 해줘야 한다.
        //복제되면서 Exception이 발생할 수 있기 때문에 Exception을 잡아줘야 한다.


        System.out.println(book2);
        //CloneNotSupportedException이 발생하는데
        //이 Book이라는 클래스는 복제가 가능하지 않은데
        //썻다는 의미이다.
        //그래서 Book클래스에 implement Cloneable을 써줘야 한다.
        //그럼 복사가 잘 된다.

    }
}
