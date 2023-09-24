// 1. Создайте класс исключения, который будет выбрасываться при делении на 0. Исключение должно отображать понятное для пользователя сообщение об ошибке.

package practice_2;

public class task3 {
    public static void main(String[] args) {
        int a;
        try {
            a = 5 / 0;
        } catch (ArithmeticException e) {
            throw new NewException2(5);
        }
    }

}
