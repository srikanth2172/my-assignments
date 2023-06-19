public class Arrayindex {
    public static void main(String[] args) {
    try {
        int a[]=new int[5];
        a[10]=50;
        System.out.println("i");

    } catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index exception");
    }
}
}

