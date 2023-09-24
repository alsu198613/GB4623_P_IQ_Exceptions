// Текст задачи:
// Обработайте возможные исключительные ситуации. “Битые” значения в исходном массиве считайте нулями. Можно внести в код правки, которые считаете необходимыми.
// 1. Корректно обработать буквы
// 2. null
// 3. не допустить выхода за пределы массива

package practice_2;

public class task1 {
    public static void main(String[] args) {
        String[][] arr = { { "1", "2", "b" }, { "3", "a", "4" }, { "c", "5", "6" } };
        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                int val = 0;
                if (arr[i][j] == null) {
                    continue;
                }
                try {
                    val = Integer.parseInt(arr[i][j]);
                } catch (Exception e) {
                    continue;
                }

                sum += val;

            }
        }

        return sum;

    }
}
