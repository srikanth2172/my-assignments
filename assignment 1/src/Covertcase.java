import java.util.Scanner;

public class Covertcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);
        char newChar;
        if (Character.isUpperCase(c))
        {
            newChar = Character.toLowerCase(c);
        }
        else
        {
            newChar = Character.toUpperCase(c);
        }
        System.out.println(c + "->" + newChar);
    }
}

