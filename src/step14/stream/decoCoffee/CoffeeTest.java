package step14.stream.decoCoffee;

public class CoffeeTest {

    public static void main(String[] args) {
        Coffee americano = new KenyaAmericano();
        americano.brewing();

        System.out.println();

        Coffee KenyaLatte = new Latte(new KenyaAmericano());
        KenyaLatte.brewing();

        System.out.println();

        Coffee kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
        kenyaMocha.brewing();

        System.out.println();

        Coffee etiopiaLatte = new Latte(new EtiopiaAmericano());
        etiopiaLatte.brewing();

        System.out.println();

        Coffee etiopiaMocha = new Mocha(new Latte(new EtiopiaAmericano()));
        etiopiaMocha.brewing();
    }
}
