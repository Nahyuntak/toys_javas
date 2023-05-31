import java.util.Scanner;

// 현탁: MAX 값 작성, 아라: MIN 값 작성
public class MaxMins {
    // 두 숫자 중 최댓값을 구하는 메서드
    public static int getMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    // 두 숫자 중 최솟값을 구하는 메서드
    public static int getMin(int num1, int num2) {
        return Math.min(num1, num2);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = myObj.nextInt(); // 첫 번째 숫자 입력

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = myObj.nextInt(); // 두 번째 숫자 입력

            int max = getMax(num1, num2); // getMax 메서드를 호출하여 max 값을 구함
            int min = getMin(num1, num2); // getMin 메서드를 호출하여 min 값을 구함

            System.out.println("두 숫자 중 최댓값은 " + max + "입니다.");
            System.out.println("두 숫자 중 최솟값은 " + min + "입니다.");

        } catch (Exception e) {
            System.out.println("올바른 숫자를 입력해주세요.");
        }
    }
}