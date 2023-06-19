public class Arguments {

    public static void main(String[] args) {
            if (args.length == 0)
            {
                System.out.println("No Values");
            } else
            {
                String values = String.join(",", args);
                System.out.println(values);
            }
        }
    }

