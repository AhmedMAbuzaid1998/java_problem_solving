import java.util.Scanner;

public class reverse_the_array {
    public static void main(String[] args) {
        int num = 7, i;
        int[] arr = new int[num];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array elements:");
        for (i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        for (i = 0; i < num / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[num - 1 - i];
            arr[num - 1 - i] = temp;
        }

        for (i = 0; i < num; i++)
            System.out.println(arr[i]);
    }
}
