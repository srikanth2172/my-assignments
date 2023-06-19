import java.util.Scanner;

public class Substraction {
    public static void main(String[] args) {
        int a,b,c;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter first number:");
        a=Scanner.nextInt();
        System.out.println("enter second number:");
         b=Scanner.nextInt();
         c=a-b;
        System.out.println("result is:"+c);
    }
}
