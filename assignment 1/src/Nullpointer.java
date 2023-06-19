public class Nullpointer {
        public static void main(String[] args) {
            try {
                String s=null;
                String str;
                int length1= (s.length());
                System.out.println("length1");

            } catch(NullPointerException e) {
                System.out.println("Null pointer exception");
            }
        }
    }


