import java.util.Scanner;

// 현탁: Max 작성, 아라: Min 작성
public class MaxMins {
    public static void printMaxAndMin(int num1, int num2) {
        try {
            int max = Math.max(num1, num2); // Choose Max number between two numbers
            int min = Math.min(num1, num2); // Choose Min number between two numbers
            System.out.println("Max: " + max); // Print Max number
            System.out.println("Min: " + min); // Print Min number
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage()); // print an error message
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = myObj.nextInt(); 
        System.out.print("Enter the second number: ");
        int num2 = myObj.nextInt();

        // 호출
        printMaxAndMin(num1, num2); 
    }
}