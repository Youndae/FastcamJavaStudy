package study01;

public class NestedLoop {

    public static void main(String[] args) {

        int dan = 2;
        int count = 1;

        /*for(dan = 2; dan <= 9; dan++){
            for(count = 1; count<= 9; count++){
                System.out.println(dan + " * " + count + " = " + dan * count);
            }
            System.out.println();
        }*/

        while(dan <= 9){
            count = 1;
            while(count <= 9){
                System.out.println(dan + " * " + count + " = " + dan * count);
                count++;
            }
            System.out.println();
            dan++;
        }
    }
}
