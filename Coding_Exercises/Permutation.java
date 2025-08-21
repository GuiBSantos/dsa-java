import java.util.Arrays;

public class Permutation {

    public boolean permutation(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        int[] sortedArray1 = array1.clone();
        int[] sortedArray2 = array2.clone();
        Arrays.sort(sortedArray1);
        Arrays.sort(sortedArray2);

        return Arrays.equals(sortedArray1, sortedArray2);
    }

}
