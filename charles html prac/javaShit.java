import java.util.Scanner;

public class javaShit {
    public static void main(String[] args) {
        Scanner mekus = new Scanner(System.in);
        System.out.print("Enter a decimal value 1:");
        double value1 = mekus.nextDouble();
        System.out.print("Enter a decimal value 2:");
        double value2 = mekus.nextDouble();
        System.out.print("Enter a decimal value 3:");
        double value3 = mekus.nextDouble();

        double result = value1 + value2 + value3;
        if (result >= 200000 || result <= 400000) {
            System.out.println("average");

        } else if (result >= 400000 || result <= 600000) {
            System.out.println("rich");
        } else if (result >= 600000 || result <= 800000) {
            System.out.println("very rich");
        } else if (result >= 800000 || result <= 1200000)
        {
            System.out.println("crazy rich");
        }
        try {
            
        } catch (Exception e) {
            // TODO: handle exception

          
        }
    }
}