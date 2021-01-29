package step11.generic;

public class GenericPrinterTest {

    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);
        System.out.println(plasticPrinter);


        /*GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
         * 다른 재료들은 상속 받았지만 water는 받지 않았기 때문에 사용할 수 없다.
         * 이런식으로 제한을 두어 사용할 수 있다.
         *
        */

        powderPrinter.printing();
        plasticPrinter.printing();

    }
}
