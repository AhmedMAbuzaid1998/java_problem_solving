public class sort_array {
    public static void main(String[] args) {
        int[] arr = {100, 5, 8, 7, 4, 10, 88, 9};
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int k = i + 1; k <= size - 1; k++) {
                if (arr[i] > arr[k]) {
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for (int i = 0; i <= size - 1; i++) {
            System.out.println(arr[i]);
        }

    }
}
