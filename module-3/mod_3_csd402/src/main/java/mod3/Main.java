package mod3;

public class Main {

    public static void main(String[] args) {
        final int maxRow = 6; // 0..6 = 7 lines total (ends with 64)

        for (int i = 0; i <= maxRow; i++) {

            // 1) Left padding to center the pyramid
            // Each number prints in a 3-char block: "%2d "  (2 digits + space)
            for (int s = 0; s < (maxRow - i) * 3; s++) {
                System.out.print(" ");
            }

            // 2) Left side increasing: 1 2 4 8 ...
            for (int j = 0; j <= i; j++) {
                int value = 1 << j; // 2^j
                System.out.printf("%2d ", value);
            }

            // 3) Right side decreasing: ... 8 4 2 1
            for (int j = i - 1; j >= 0; j--) {
                int value = 1 << j;
                System.out.printf("%2d ", value);
            }

            // 4) End-of-line symbol (required)
            System.out.println("@");
        }
    }
}
