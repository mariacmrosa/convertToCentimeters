import java.util.Scanner;

public class Main {

    public static double convertToCentimeters(int heightInInches) {

        return heightInInches * 2.54;
    }

    public  static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        int heightInFeetConverted = heightInFeet * 12;
        int totalHeight = heightInFeetConverted + remainingHeightInInches;
        return convertToCentimeters(totalHeight);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter height in feet (a round value): ");

        int heightInFeet = scanner.nextInt();

        System.out.println("Now enter the remaining value of height in inches: ");

        int remainingHeightInInches = scanner.nextInt();
        double convertedHeight = convertToCentimeters(heightInFeet, remainingHeightInInches);

        System.out.println("Converted height: " + convertedHeight);





    }
}