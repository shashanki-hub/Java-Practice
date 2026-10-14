import java.util.Scanner;

public class Reverse_number {
    public static void reverse(int[] a) {
        for (int i = 0; i < 5; i++) {
            int temp = a[i];
            a[i] = a[9 - i];
            a[9 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        System.out.println("Enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        reverse(a);

        System.out.println("Reversed numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}