package practice_2;

import java.io.FileWriter;
import java.io.IOException;

public class task0 {
    public static void main(String[] args) {
        int[] array = { 1, 9 };
        fillArray(array);
        try {
            FileWriter fileWriter = new FileWriter("hello.txt");
            fileWriter.write("hello");
            System.out.println("hello from try all is ok");
            // throw new IOException("hello from try block");
        } catch (Exception e) {
            System.out.println("hello from catch block");
            e.printStackTrace();

        } finally {
            System.out.println("hello from final block");

        }
    }

    public static void fillArray(int[] arr) {
        int n = 10;
        if (arr.length > n) {
            arr[10] = 7;
        }

    }
}