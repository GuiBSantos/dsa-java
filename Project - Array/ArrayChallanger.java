import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayChallanger {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("How many day`s temperature? ");
        int resp = entrada.nextInt();

        int[] array = new int[resp];
        var total = 0;

        for (int i = 0; i < resp; i++) {

            System.out.print("Day " + (i + 1) + "`s highest temperature? ");
            int temp = entrada.nextInt();
            array[i] = temp;
            total += array[i];
        }

        double average = (double) total / array.length;

        System.out.println("Avarage = " + average);

        List<Integer> arrAbove = new ArrayList<>();
        List<Integer> arrBelow = new ArrayList<>();

        for (int value : array) {
            if (value > average) {
                arrAbove.add(value);
            } else {
                arrBelow.add(value);
            }
        }

        System.out.println("Temperature above: " + arrAbove);
        System.out.println("Temperature below: " + arrBelow);

    }
}
