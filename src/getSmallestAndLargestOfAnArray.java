public class getSmallestAndLargestOfAnArray {
    public static void main(String[] args) {

        int[] arr = {10, 55, -1, 17, 48};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


    }
}
