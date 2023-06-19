import java.util.Scanner;

public class Floyds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in Floyd's triangle: ");
        int rows = scanner.nextInt();
        int i = 1;
        int number = 1;

        while(i <= rows) {
            int j = 1;
            while(j <= i) {
                System.out.print(number + " ");
                number++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

