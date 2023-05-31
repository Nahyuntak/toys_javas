public class PollStatistics {
    public void printAnswers(String[] answers) {
        for (int first = 0; first < answers.length; first++) {
            if (first != 0) {
                System.out.print(", ");
            }
            System.out.printf("%d. (%s)", first + 1, answers[first]);
        }
    }

    public static void main(String[] args) {
        try {
            PollStatistics pollStats = new PollStatistics();
            String[] answers = { "A", "B", "C", "D" };
            pollStats.printAnswers(answers);
        } catch (Exception e) {
            // 예외 처리 코드
        }
    }
}