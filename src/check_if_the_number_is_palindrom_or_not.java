public class check_if_the_number_is_palindrom_or_not {

    public static void main(String[] args) {

        //plaindrom "757 or 1221"
        int n = 7157, r, result = 0;
        int temp = n;
        while (temp != 0) {
            r = temp % 10;
            result = (result * 10) + r;
            temp = temp / 10;
        }
        if (result == n) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }

    }
}
