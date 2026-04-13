import java.util.Scanner;

public class Sunrise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // TODO: Read n
        int n = sc.nextInt();

        // TODO: Read the array of heights
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        // TODO: Count buildings that can see the sunrise
        int count = 0;
        int maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (h[i] > maxHeight) {
                count++;
                maxHeight = h[i];
            }
        }

        // TODO: Print the count
        System.out.println(count);
    }
}
