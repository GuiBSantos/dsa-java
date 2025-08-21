public class ContainsDuplicate {
    public boolean containsDuplicate(int[] intArray) {

        for (int i = 0; i < intArray.length - 1; i++ ) {

            for(int j = i + 1; j < intArray.length; j++) {

                if (intArray[i] == intArray[j]) {

                    return true;

                }

            }
        }

        return false;

    }
}
