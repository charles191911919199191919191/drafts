import java.util.Scanner;

public class etodawIrene {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lagay ka pangalan mo dto kunyari
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        // bale ito magiging score nila yung zero dadagdag kada tamang sagot
        int score = 0;

        // Question 1
        System.out.println("Question 1: What is the Capital of the Phil?");
        System.out.println("A. Manila\nB. Cebu\nC. Pampanga\n");
        System.out.print("Enter Answer: ");
        String answer1 = scanner.nextLine().trim();
        if (answer1.equalsIgnoreCase("A")) {
            score++;
        }

        // Question 2
        System.out.println("Question 2: Who is the father of the WEB?");
        System.out.println("A. Tim Marquez\nB. Tim Henson\nC. Tim Berners-Lee\n");
        System.out.print("Enter Answer: ");
        String answer2 = scanner.nextLine().trim();
        if (answer2.equalsIgnoreCase("C")) {
            score++;
        }

        // Question 3
        System.out.println("Question 3: What is HTML?");
        System.out.println("A. High-Level Text Language\nB.  HyperText Markup Language\nC. HyperTransfer Markup Language\n");
        System.out.print("Enter Answer: ");
        String answer3 = scanner.nextLine().trim();
        if (answer3.equalsIgnoreCase("B")) {
            score++;
        }

        // Displaying results
        System.out.println("Your Correct Answer: " + score);
        System.out.println("Your Score: " + score + "/3");
    }

  
}