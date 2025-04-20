import java.util.HashSet;
import java.util.Set;

public class two_arrays_and_print_the_duplicate_numbers {
    public static void main(String[] args) {
        /*
        //if there is no duplicated number in same array
        int [] arr1={1,5,8,7,4,6,2,0};
        int [] arr2={4,7,8,3};
            for (int i : arr1)
                for (int j : arr2) {
                    if (i == j)
                        System.out.println(j);
                }
                */

        //if there is duplicated number in same array
        int[] array1 = {1, 5, 8, 8, 12, 20, 30, 30};
        int[] array2 = {3, 5, 5, 7, 8, 15, 20, 30};
        Set<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        Set<Integer> printed = new HashSet<>();

        System.out.println("Duplicate numbers:");

        for (int num : array2) {
            if (set1.contains(num) && !printed.contains(num)) {
                System.out.println(num);
                printed.add(num);
            }
        }
    }

}

