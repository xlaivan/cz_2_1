import java.util.ArrayList;
public class Main {
    public static int[] filterEvenIndexOddValue(int[] array) {
        java.util.ArrayList<Integer> result = new java.util.ArrayList<>();
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                result.add(array[i]);
            }
        }
        int[] filtered = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            filtered[i] = result.get(i);
        }
        return filtered;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6};
        int[] test2 = {2, 3, 4, 5, 6, 7};
        int[] test3 = {7, 8, 9, 10, 11};

        printArray(filterEvenIndexOddValue(test1));
        printArray(filterEvenIndexOddValue(test2)); // (nic)
        printArray(filterEvenIndexOddValue(test3));
    }
}