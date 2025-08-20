import java.util.Scanner;

public class ArrayResolve {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("How many day`s temperature? ");
        int numDays = entrada.nextInt();
        int sum = 0;

        for (int i = 1; i <= numDays ; i++) {
            System.out.println("Day? " + i + "`s highest temperature? ");
            int next = entrada.nextInt();
            sum += next;
        }

        double average = sum / numDays;
        System.out.println();
        System.out.println("Average Temp = " + average);
    }
}
