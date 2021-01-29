package step14.stream.inputStream;

import java.io.Console;

/**
 * cmd에서 실행해야 한다.
 * bin에서 실행.
 */
public class ConsoleTest {

    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("이름 : ");
        String name = console.readLine();

        System.out.println("비밀번호 : ");
        char[] pw = console.readPassword();

        System.out.println(name);
        System.out.println(pw);
    }
}
