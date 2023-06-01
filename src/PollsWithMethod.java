import java.util.Scanner;

import poll.PollInitailArrays;
import poll.PollScanners;
import poll.PollStatistics;

public class PollsWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 이름 입력
        System.out.println("> 이름을 입력하세요");
        System.out.print("이름) ");
        String name = scanner.nextLine();

        // 문항 호출 from poll/PollInitailArrays.java
        String[] questions = PollInitailArrays.getQuestions();

        // 답항 호출 from poll/PollScanners.java
        int[] answers = PollScanners.getAnswers(questions.length, scanner);

        System.out.println("---------------설문 종료---------------");
        System.out.println();
        System.out.println("---------------설문 결과---------------");

        // 결과 정리 호출 from poll/PollStatistics.java
        PollStatistics pollStatistics = new PollStatistics();
        pollStatistics.printAnswers(answers);
    }
}