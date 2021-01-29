package step9.interfaceEx2;

public class CalcTest {

    public static void main(String[] args) {
        Calc calc = new CompleteCalc();
        /*
            CompleteCalc는 Calculator를 상속받는데
            Calculator는 Calc인터페이스를 implements하기 때문에
            Calc calc = new CompleteCalc();
            Calculator calc = new CompleteCalc();
            이렇게도 쓸 수 있다.
            단, showInfo는 CompleteCalc에만 있는 메소드이기 때문에
            showInfo는 사용할 수 없다.
         */
        int n1 = 10;
        int n2 = 2;


        System.out.println(calc.add(n1, n2));
        System.out.println(calc.sub(n1, n2));
        System.out.println(calc.mul(n1, n2));
        System.out.println(calc.div(n1, n2));


        calc.description();

        int arr[] = {1, 2, 3, 4, 5};
        int sum = Calc.total(arr);//이건 인스턴스 변수가 아니라 인터페이스 타입으로 가져다 써야한다.
        System.out.println(sum);

    }
}
