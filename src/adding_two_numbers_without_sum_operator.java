public class adding_two_numbers_without_sum_operator {

    public static void main(String[] args) {
        int x = 45, y = -5;
        while (y != 0) {
            if (y > 0) {
                x++;
                y--;
            } else {
                x--;
                y++;
            }
        }
        System.out.println("sum = " + x);
    }
}

