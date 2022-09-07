import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in Â°F: ");

        int number = scanner.nextInt();
        System.out.printf(number + "Â°F");

        double celcius = (number - 32) * (5.0/9.0);
        double two = celcius + 2.0;

        System.out.println("");
        System.out.printf("The temperature in Â°C is: %f", celcius);
        System.out.println("");
        System.out.printf("If it were 2Â°C warmer, it would be: %f in Â°C", two);
    }
}
