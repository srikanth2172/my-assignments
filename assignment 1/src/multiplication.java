import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {

        int a, b, result;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number :");
        a = sc.nextInt();
        System.out.println("enter second number :");
        b = sc.nextInt();
        result = result (a,b);
        System.out.println("the result is :" + result);
    }
public static int result(int a,int b) {
    int result = a * b;
    return result;
}
}

