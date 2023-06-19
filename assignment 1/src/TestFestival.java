public class TestFestival {
    public static void main(String[] args) {
        Festival f;
        f = new PONGAL();
        System.out.println("Message for PONGAL is :" + f.getMessage() );
        f = new DIWALI();
        System.out.println("Message for DIWALI is :" + f.getMessage());
    }
}


