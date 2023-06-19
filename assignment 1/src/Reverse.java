import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = Scanner.nextInt();
        Scanner.close();
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversedNum);
    }
}

