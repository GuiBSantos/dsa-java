import java.util.Scanner;

public class ArrayResolveWithArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("How many day`s temperature? ");
        int numDays = entrada.nextInt();

        int[] temps  = new int[numDays];
        int sum = 0;

        for (int i = 0; i < numDays; i++) {
            System.out.println("Day " + (i + 1) + "`s highest temperature? ");
            temps[i] = entrada.nextInt();
            sum += temps[i];
        }

        double average = (double) sum / numDays;
        int aboveCount = 0;

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                aboveCount++;
            }
        }
        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.println("Number of days above average: " + aboveCount);
    }
}
