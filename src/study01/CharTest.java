package study01;

public class CharTest {

    public static void main(String[] args) {

        char ch = 'A';
        System.out.println(ch);
        //A
        System.out.println((int)ch);
        //65

        int iCh = 66;
        System.out.println((char)iCh);
        //B

        char hangul = '\uAC00'; //Unicode
        System.out.println(hangul);
        //가

    }
}
