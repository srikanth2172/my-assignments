public class ArathamaticEx {

    public  static void main(String[] args) {
        try {
            int a=20/0;
            System.out.println("a");

        } catch(ArithmeticException e) {
            System.out.println("arithmetic exception");
        }
    }
}

