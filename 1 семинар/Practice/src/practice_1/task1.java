package practice_1;
// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:

// 1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
// 2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
// 3. если вместо массива пришел null, метод вернет -3

public class task1 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        // int[] array = null;
        System.out.println(checkArray(array, 7));

    }

    public static int checkArray(int[] arr, int value) {
        int n = 20;

        if (arr != null) {
            if (arr.length < n) {
                return -1;
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    return i;
                }
            }
            return -2;

        } else
            return -3;

    }
}