public class CheckedExceptionClass {
    public static void main(String[] args) {
        try {
            Class Exception = Class.forName("srikanth");
        }
        catch(ClassNotFoundException e) {
            System.out.println("No class Exists");
        }
    }
}
