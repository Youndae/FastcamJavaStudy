package step11.generic;

public class Powder extends material{

    public String toString(){
        return "재료는 Powder 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Power로 프린팅 합니다.");
    }
}
