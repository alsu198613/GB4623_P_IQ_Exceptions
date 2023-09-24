package practice_2;

public class NewException2 extends ArithmeticException {
    public NewException2(int num) {
        System.out.println("Делить " + num + " на ноль нельзя!");
        ;
    }
}
