// **Текст задачи:**
// Запишите в файл следующие строки:
// Анна=4
// Елена=5
// Марина=6
// Владимир=?
// Константин=?
// Иван=4
// Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.

package practice_2;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("Анна", "4");
        names.put("Елена", "5");
        names.put("Марина", "6");
        names.put("Владимир", "?");
        names.put("Константин", "?");
        names.put("Иван", "4");
        for (String key : names.keySet()) {
            String value = names.get(key);
            if (value.equals("?")) {
                names.put(key, String.valueOf(key.length()));
            }
        }
        System.out.println(names.toString());
    }
}
