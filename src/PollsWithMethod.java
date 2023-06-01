import java.util.Scanner;

import poll.PollStatistics;
import poll.PollInitailArrays;
import poll.PollScanners;



import java.util.Scanner;
import poll.PollInitailArrays;
import poll.PollScanners;
import poll.PollStatistics;

public class PollsWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("> 이름을 입력하세요");
        System.out.print("이름) ");
        String name = scanner.nextLine();

        String[] questions = PollInitailArrays.getQuestions();

        int[] answers = PollScanners.getAnswers(questions.length, scanner);

        System.out.println("---------------설문 종료---------------");
        System.out.println();
        System.out.println("---------------설문 결과---------------");

        PollStatistics pollStatistics = new PollStatistics();
        pollStatistics.printAnswers(answers);
    }
}