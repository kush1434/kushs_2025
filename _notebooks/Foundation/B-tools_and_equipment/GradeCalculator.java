import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Variables to store student information and class details
        String studentName = "Alex"; // Student's name
        String className = "Math 101"; // Class name

        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Get the three test scores from the user
        System.out.print("Enter the score for Test 1: ");
        int testScore1 = scanner.nextInt();

        System.out.print("Enter the score for Test 2: ");
        int testScore2 = scanner.nextInt();

        System.out.print("Enter the score for Test 3: ");
        int testScore3 = scanner.nextInt();

        // Final constant values that shouldn't change
        final int MAX_SCORE = 100;

        // Calculating the average score
        double averageScore = (testScore1 + testScore2 + testScore3) / 3.0;

        // Determine the letter grade based on the average score
        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the results
        System.out.println("\nStudent: " + studentName);
        System.out.println("Class: " + className);
        System.out.println("Average Score: " + String.format("%.2f", averageScore));
        System.out.println("Letter Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}
