import java.util.Scanner;

public class Color {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter color code: ");
            String colorCode = scanner.nextLine();

            String colorName;
            switch (colorCode) {
                case "R":
                    colorName = "Red";
                    break;
                case "B":
                    colorName = "Blue";
                    break;
                case "G":
                    colorName = "Green";
                    break;
                case "O":
                    colorName = "Orange";
                    break;
                case "Y":
                    colorName = "Yellow";
                    break;
                case "W":
                    colorName = "White";
                    break;
                default:
                    colorName = "Invalid Code";
            }

            System.out.println("Color name: " + colorName);
        }
    }

